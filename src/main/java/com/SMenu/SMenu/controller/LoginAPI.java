package com.SMenu.SMenu.controller;

import com.SMenu.SMenu.dto.LoginDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Log4j2
@RequestMapping("/loginn")
@RestController
public class LoginAPI {
    @PostMapping("")
    public void login(@RequestBody LoginDTO loginForm) {
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();




    }
}

