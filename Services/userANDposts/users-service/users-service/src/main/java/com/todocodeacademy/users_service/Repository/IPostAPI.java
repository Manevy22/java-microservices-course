package com.todocodeacademy.users_service.Repository;

import com.todocodeacademy.users_service.dto.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("posts-service")//mismo nombre que tiene en eureka-Services
public interface IPostAPI {

    @GetMapping("/post/{user_id}")
    public List<PostDTO> getPostsByUserId(@PathVariable("user_id") Long user_id);


}
