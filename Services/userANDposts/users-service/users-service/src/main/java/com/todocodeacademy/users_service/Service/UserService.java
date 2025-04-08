package com.todocodeacademy.users_service.Service;

import com.todocodeacademy.users_service.Model.User;
import com.todocodeacademy.users_service.Repository.IPostAPI;
import com.todocodeacademy.users_service.Repository.IUserRepository;
import com.todocodeacademy.users_service.dto.PostDTO;
import com.todocodeacademy.users_service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService
{
    @Autowired
    private IUserRepository repo;
    @Autowired
    private IPostAPI postapi;


    @Override
    public UserDTO getUserAndPosts(Long user_id) {
        User user = repo.findById(user_id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + user_id));

        List<PostDTO> postsList=postapi.getPostsByUserId(user_id);
        return new UserDTO(
                user.getUser_id(), user.getName(), user.getLastname(), user.getCellphone(),
                postsList
        );
    }
}
