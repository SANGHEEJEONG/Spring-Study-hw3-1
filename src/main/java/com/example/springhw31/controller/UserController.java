package com.example.springhw31.controller;

import com.example.springhw31.dto.UserDto;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * 회원가입 메서드처럼 UserDto를 파라미터로 받아주세요
 */

public class UserController {


  public UserDto join(@ModelAttribute UserDto userDto) {

  }
}
