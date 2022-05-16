package com.example.functionofproblem100.notice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class NoticeInput {

    @Size(max = 100,min = 10,message = "제목의 경우 10자이상 100자이하여야 합니다.")
    @NotBlank(message = "제목은 필수항목입니다.")
    private String title;
    @Size(max = 1000,min = 50,message = "내요의 경우 10자이상 100자이하여야 합니다.")
    @NotBlank(message = "내용은 필수항목입니다.")
    private String contents;



}
