package com.todocodeacademy.posts_service.Service;
import com.todocodeacademy.posts_service.Model.Post;

import java.util.List;


public interface IPostService {
    public List<Post> getPostsByUsers(Long user_id);
}
