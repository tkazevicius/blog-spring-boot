package com.blog.blogspringboot.service;

import com.blog.blogspringboot.payload.PostDto;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    PostDto createPost(PostDto postDto);
}
