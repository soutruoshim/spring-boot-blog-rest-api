package com.srhdp.blogrestapi.service;

import com.srhdp.blogrestapi.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
    CommentDto getCommentById(long postId, long commentId);
    CommentDto updateComment(long postId, long commentId, CommentDto commentDto);
    List<CommentDto> getCommentByPostId(long postId);
}
