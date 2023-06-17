package com.srhdp.blogrestapi.service;

import com.srhdp.blogrestapi.payload.PostDto;
import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPosts();
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePost(long id);
}
