package com.todocodeacademy.users_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long user_id;
    private String name;
    private String lastname;
    private String cellphone;
    private List<PostDTO> PostsList;
}
