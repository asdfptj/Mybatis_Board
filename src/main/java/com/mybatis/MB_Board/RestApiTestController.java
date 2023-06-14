package com.mybatis.MB_Board;

import com.mybatis.MB_Board.common.dto.SearchDto;
import com.mybatis.MB_Board.common.paging.PagingResponse;
import com.mybatis.MB_Board.domain.post.PostResponse;
import com.mybatis.MB_Board.domain.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestApiTestController {
    private final PostService postService;

    @GetMapping("/posts")
    public PagingResponse<PostResponse> findAllPost() {
        return postService.findAllPost(new SearchDto());
    }
}
