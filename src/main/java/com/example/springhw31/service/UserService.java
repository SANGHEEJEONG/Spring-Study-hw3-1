package com.example.springhw31.service;

import com.example.springhw31.dto.UserDto;
import com.example.springhw31.entity.User;
import com.example.springhw31.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

/**
 * Controller에 반환할 때도 DTO 객체를 반환합니다.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto join(UserDto userDto) {
        User newUser = new User();
        newUser.setUsername(userDto.getUsername());
        newUser.setPassword(userDto.getPassword());
        newUser.setNickname(userDto.getNickname());

        userRepository.save(newUser);
        return userDto;
    }

    public String login(UserDto userDto) {
        Optional<User> user = userRepository.findByUsername(userDto.getUsername());

        if(user.isPresent() && user.get().getPassword().equals(userDto.getPassword()))
          return userDto.getUsername() + "님, 환영합니다!!";

        return "아이디 및 비밀번호가 일치하지 않습니다.";
    }

}
