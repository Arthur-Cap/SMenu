package com.SMenu.SMenu.controller;

import com.SMenu.SMenu.repository.AgencyAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestAPI {
    private final AgencyAccountRepository agencyAccountRepository ;
    @GetMapping("/test")
    public String test (){
        agencyAccountRepository.findByUserName("ak");

        return "tested";
    }
}
