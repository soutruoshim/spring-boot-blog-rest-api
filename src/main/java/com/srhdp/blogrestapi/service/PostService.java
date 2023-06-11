package com.srhdp.blogrestapi.service;

import com.srhdp.blogrestapi.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
