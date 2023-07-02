package com.srhdp.blogrestapi.service.impl;

import com.srhdp.blogrestapi.payload.LoginDto;
import com.srhdp.blogrestapi.service.AuthService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private AuthenticationManager authenticationManager;

    public AuthServiceImpl(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public String login(LoginDto loginDto) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
              loginDto.getUsernameOrEmail(),
              loginDto.getPassword()
        ));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return "User login successfully!";
    }
}
