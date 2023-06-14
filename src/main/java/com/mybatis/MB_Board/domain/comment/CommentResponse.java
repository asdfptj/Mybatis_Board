package com.mybatis.MB_Board.domain.comment;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponse {
    private Long id;
    private Long postId;
    private String content;
    private String writer;
    private Boolean deleteYn;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;
}
