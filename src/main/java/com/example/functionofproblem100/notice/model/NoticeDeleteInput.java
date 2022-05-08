package com.example.functionofproblem100.notice.model;

import com.example.functionofproblem100.notice.entity.Notice;
import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class NoticeDeleteInput {
    private List<Long> idList;
}
