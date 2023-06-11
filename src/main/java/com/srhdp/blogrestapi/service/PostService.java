package com.srhdp.blogrestapi.service;

import com.srhdp.blogrestapi.payload.PostDto;
import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPosts();
}
