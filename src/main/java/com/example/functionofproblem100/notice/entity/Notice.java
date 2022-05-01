package com.example.functionofproblem100.notice.entity;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Notice {


    private long id;
    private String title;
    private String contents;
    private LocalDateTime regDate;

}
