package com.example.functionofproblem100.notice.controller;


import com.example.functionofproblem100.notice.model.NoticeModel;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {


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
                .id(1)
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
//
//    @PostMapping("/api/notice4")
//    public NoticeModel addNotice4(@RequestBody NoticeModel noticeModel){
//
//    re
//    }
}
