package com.fullmugu.nanumeal.api.service.user;

import com.fullmugu.nanumeal.api.dto.UserDTO;
import com.fullmugu.nanumeal.api.entity.user.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    User getUserFromReq(HttpServletRequest request);

    User getUserById(Long id);

    UserDTO getUser(Long id);

    default UserDTO entityToDto(User user) {
        UserDTO userDTO = UserDTO.builder()
                .age(user.getAge())
                .name(user.getName())
                .email(user.getEmail())
                .nickName(user.getNickName())
                .type(user.getType())
                .location(user.getLocation())
                .build();
        return userDTO;
    }
}
