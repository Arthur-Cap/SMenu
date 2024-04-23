package com.SMenu.SMenu.service;

import com.SMenu.SMenu.model.User;
import com.SMenu.SMenu.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserAccountRepository userAccountRepository;

    public List<User> allUsers() {

        return new ArrayList<>(userAccountRepository.findAll());
    }
}