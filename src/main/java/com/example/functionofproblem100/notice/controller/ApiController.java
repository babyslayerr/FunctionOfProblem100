package com.example.functionofproblem100.notice.controller;


import com.example.functionofproblem100.notice.model.NoticeModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {


//    @GetMapping("/api/notice")
//    public NoticeModel notice(){
//
//        LocalDateTime regDt = LocalDateTime.of(2021,1,30,0,0);
//
//        NoticeModel noticeModel = new NoticeModel();
//        noticeModel.setId(1);
//        noticeModel.setTitle("공지사항입니다.");
//        noticeModel.setContents("공지사항 내용입니다. ");
//        noticeModel.setRegDate(regDt);
//        return noticeModel;
//    }

    @GetMapping("/api/notice2")
    public NoticeModel apiNotice2(){

        LocalDateTime regDate = LocalDateTime.of(2021,2,8,0,0);

        NoticeModel noticeModel = new NoticeModel();
        noticeModel.setId(1);
        noticeModel.setTitle("공지사항입니다.");
        noticeModel.setContents("공지사항 내용입니다.");
        noticeModel.setRegDate(regDate);

        return noticeModel;
    }

    @GetMapping("/api/notice")
    public List<NoticeModel> notice(){

        List<NoticeModel> noticeModelList = new ArrayList<>();

        return noticeModelList;

    }
}
