package com.todocodeacademy.users_service.Service;


import com.todocodeacademy.users_service.dto.UserDTO;

public interface IUserService {
public UserDTO getUserAndPosts(Long user_id);
}
