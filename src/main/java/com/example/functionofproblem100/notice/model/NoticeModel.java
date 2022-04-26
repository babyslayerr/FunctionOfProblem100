package com.example.functionofproblem100.notice.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NoticeModel {

    private int id;
    private String title;
    private String contents;
    private LocalDateTime regDate;


}
