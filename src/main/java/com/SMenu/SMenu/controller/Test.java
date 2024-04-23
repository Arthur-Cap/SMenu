package com.SMenu.SMenu.controller;

import com.SMenu.SMenu.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class Test {
    private final UserAccountRepository userAccountRepository ;
    @GetMapping("/test")
    public String test (){
        userAccountRepository.findByUserName("ak");

        return "tested";
    }
}
