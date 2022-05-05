package com.example.functionofproblem100.notice.controller;


import com.example.functionofproblem100.notice.entity.Notice;
import com.example.functionofproblem100.notice.exception.NoticeNotFoundException;
import com.example.functionofproblem100.notice.model.NoticeInput;
import com.example.functionofproblem100.notice.model.NoticeModel;
import com.example.functionofproblem100.notice.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class ApiController {

    @Autowired
    private final NoticeRepository noticeRepository;


//    @GetMapping("/api/notice3")
//    public List<NoticeModel> notice3(){
//
//        LocalDateTime regDt1 = LocalDateTime.of(2021,1,30,0,0);
//        LocalDateTime regDt2 = LocalDateTime.of(2021,1,31,0,0);
//
//        List<NoticeModel> noticeModelList = new ArrayList<>();
//        NoticeModel noticeModel1 = new NoticeModel();
//        noticeModel1.setId(1);
//        noticeModel1.setTitle("공지사항 입니다.");
//        noticeModel1.setContents("공지사항 내용입니다. ");
//        noticeModel1.setRegDate(regDt1);
//        noticeModelList.add(noticeModel1);
//
//        NoticeModel noticeModel2 = new NoticeModel();
//        noticeModel1.setId(2);
//        noticeModel1.setTitle("두번째 공지사항 입니다.");
//        noticeModel1.setContents("두번째 공지사항 내용입니다. ");
//        noticeModel1.setRegDate(regDt2);
//        noticeModelList.add(noticeModel2);
//        return noticeModelList;
//    }
//
//    @GetMapping("/api/notice2")
//    public NoticeModel apiNotice2(){
//
//        LocalDateTime regDate = LocalDateTime.of(2021,2,8,0,0);
//
//        NoticeModel noticeModel = new NoticeModel();
//        noticeModel.setId(1);
//        noticeModel.setTitle("공지사항입니다.");
//        noticeModel.setContents("공지사항 내용입니다.");
//        noticeModel.setRegDate(regDate);
//
//        return noticeModel;
//    }

    @GetMapping("/api/notice")
    public List<NoticeModel> notice(){

        List<NoticeModel> noticeModelList = new ArrayList<>();

        return noticeModelList;

    }
//
//    @GetMapping("/api/notice/count")
//    public int noticeCount(){
//
//        return 20;
//    }
    @PostMapping("/api/notice")
    public NoticeModel addNotice(@RequestParam String title, @RequestParam String contents){

        NoticeModel noticeModel = NoticeModel.builder()
                .title(title)
                .contents(contents)
                .regDate(LocalDateTime.now())
                .build();


        return noticeModel;
    }
    @PostMapping("/api/notice2")
    public NoticeModel addNotice2(NoticeModel noticeModel){

        noticeModel.setId(2);
        noticeModel.setRegDate(LocalDateTime.now());

        return noticeModel;
    }


    @PostMapping("/api/notice3")
    public NoticeModel addNotice3(@RequestBody NoticeModel noticeModel){  //json파일을 받기 위함
        noticeModel.setId(3);
        noticeModel.setRegDate(LocalDateTime.now());

        return noticeModel;
    }
    @PostMapping("/api/notice4")
    public Notice addNotice4(@RequestBody NoticeInput noticeInput){

        Notice notice = Notice.builder()
                .title(noticeInput.getTitle())
                .contents(noticeInput.getContents())
                .regDate(LocalDateTime.now())
                .build();
//
        noticeRepository.save(notice);
//
        return notice;
    }

    @PostMapping("/api/notice5")
    public Notice addNotice5(@RequestBody NoticeInput noticeInput){
        Notice notice = Notice.builder()
                .title(noticeInput.getTitle())
                .contents(noticeInput.getContents())
                .regDate(LocalDateTime.now())
                .build();

//        noticeRepository.save(notice);
        Notice resultNotice = noticeRepository.save(notice);
        return resultNotice;

    }
    @GetMapping("/api/notice/{id}")
    public Notice notice(@PathVariable Long id){

       Optional<Notice> notice = noticeRepository.findById(id);
       if(notice.isPresent()){
            return notice.get();
       }

       return null;

    }

//    @PutMapping("/api/notice/{id}")
//    public void updateNotice(@PathVariable Long id ,@RequestBody NoticeInput noticeInput){
//        Optional<Notice> notice = noticeRepository.findById(id);
//        if (notice.isPresent()){
//            notice.get().setTitle(noticeInput.getTitle());
//            notice.get().setContents(noticeInput.getContents());
//            notice.get().setUpdateDate(LocalDateTime.now());
//            noticeRepository.save(notice.get());
//        }
//    }
    @ExceptionHandler(NoticeNotFoundException.class)
    public ResponseEntity<String> handlerNoticeNotFoundException(NoticeNotFoundException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

//    @PatchMapping("/api/notice/{id}")
//    public void updateNotice1(@PathVariable Long id, @RequestBody NoticeInput noticeInput){
//
//        Optional<Notice> notice = noticeRepository.findById(id);
//        if(notice.isPresent()) {
//            notice.get().setTitle(noticeInput.getTitle());
//            notice.get().setContents(noticeInput.getContents());
//            notice.get().setUpdateDate(LocalDateTime.now());
//            noticeRepository.save(notice.get());
//        }else{
//            throw new NoticeNotFoundException("공지사항내용이 없습니다.");
//        }
//
//
//    }

    @PatchMapping("/api/notice/{id}/likeCount")
    public void updateLikeCount(@PathVariable Long id){

        Notice notice = noticeRepository.findById(id)
                .orElseThrow(() -> new NoticeNotFoundException("공지사항 내용이 없습니다."));

        notice.setViewsCount(notice.getViewsCount() + 1);
        noticeRepository.save(notice);
    }

    @DeleteMapping("/api/notice/{id}")
    public void deleteNotice(@PathVariable Long id){

        Notice notice = noticeRepository.findById(id)
                .orElseThrow(() -> new NoticeNotFoundException("공지사항 내용 없다고!!!"));

        noticeRepository.delete(notice);

    }
}
