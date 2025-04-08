package com.todocodeacademy.posts_service.Service;

import com.todocodeacademy.posts_service.Model.Post;
import com.todocodeacademy.posts_service.Repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService{
    @Autowired
    private IPostRepository repo;

    @Override
    public List<Post> getPostsByUsers(Long user_id) {
        return repo.findPostByUser_id(user_id);
    }
}
