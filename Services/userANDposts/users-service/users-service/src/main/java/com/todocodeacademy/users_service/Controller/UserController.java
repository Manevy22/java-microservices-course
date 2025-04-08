package com.todocodeacademy.users_service.Controller;

import com.todocodeacademy.users_service.Service.IUserService;
import com.todocodeacademy.users_service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService servis;

    @GetMapping("/post/{user_id}")
    public UserDTO getUserAndPosts(@PathVariable Long user_id){
        return servis.getUserAndPosts(user_id);
    }

}
