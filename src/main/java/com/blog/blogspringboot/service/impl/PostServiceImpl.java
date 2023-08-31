package com.blog.blogspringboot.service.impl;

import com.blog.blogspringboot.model.Post;
import com.blog.blogspringboot.payload.PostDto;
import com.blog.blogspringboot.repository.PostRepository;
import com.blog.blogspringboot.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    ModelMapper modelMapper = new ModelMapper();

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = modelMapper.map(postDto, Post.class);
        Post newPost = postRepository.save(post);
        return modelMapper.map(newPost, PostDto.class);
    }
}
