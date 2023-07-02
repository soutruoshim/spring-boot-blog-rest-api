package com.srhdp.blogrestapi.service;

import com.srhdp.blogrestapi.payload.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
