package com.example.functionofproblem100.notice.controller;


import com.example.functionofproblem100.notice.model.NoticeModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ApiController {


    @GetMapping("/api/notice")
    public String notice(){

        return "공지사항입니다.";
    }

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
}
