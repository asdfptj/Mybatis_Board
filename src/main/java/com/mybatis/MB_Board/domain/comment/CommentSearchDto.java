package com.mybatis.MB_Board.domain.comment;

import com.mybatis.MB_Board.common.dto.SearchDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentSearchDto extends SearchDto {
    private Long postId;

}
