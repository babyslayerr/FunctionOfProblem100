package com.example.functionofproblem100.notice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class NoticeModel {

    private long id;
    private String title;
    private String contents;
    private LocalDateTime regDate;
    private long viewsCount = 0;
    private long likeCount = 0;


}
