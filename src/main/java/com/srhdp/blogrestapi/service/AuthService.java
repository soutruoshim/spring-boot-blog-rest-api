package com.srhdp.blogrestapi.service;

import com.srhdp.blogrestapi.payload.LoginDto;
import com.srhdp.blogrestapi.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
