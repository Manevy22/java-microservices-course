package com.todocodeacademy.posts_service.Controller;

import com.todocodeacademy.posts_service.Model.Post;
import com.todocodeacademy.posts_service.Service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private IPostService servis;

    @Value("${server.port}")
    private int serverPort;


    @GetMapping("/{user_id}")
    public List<Post> getPostByUserId(@PathVariable Long user_id){
        System.out.println("--------------Estoy en el puerto: "+serverPort);
        return servis.getPostsByUsers(user_id);
    }
}
