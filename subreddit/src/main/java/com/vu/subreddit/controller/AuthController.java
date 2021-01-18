package com.vu.subreddit.controller;

import com.vu.subreddit.dto.AuthenticationResponse;
import com.vu.subreddit.dto.LoginRequest;
import com.vu.subreddit.dto.RegisterRequest;
import com.vu.subreddit.model.User;
import com.vu.subreddit.service.AuthService;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity(OK);
    }


    @PostMapping("/login")
    public AuthenticationResponse login (@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }
    
    @GetMapping("accountVerification/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token) {
        authService.verifyAccount(token);
        return new ResponseEntity<>("Account Activated Successully", OK);
    }
}
