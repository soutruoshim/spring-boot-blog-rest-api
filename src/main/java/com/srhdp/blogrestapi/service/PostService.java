package com.srhdp.blogrestapi.service;

import com.srhdp.blogrestapi.payload.PostDto;
import com.srhdp.blogrestapi.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    //List<PostDto> getAllPosts();
    //List<PostDto> getAllPosts(int pageNo, int pageSize);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePost(long id);
}
