package com.SMenu.SMenu.service;

import com.SMenu.SMenu.dto.LoginDTO;
import com.SMenu.SMenu.dto.RegisterDTO;
import com.SMenu.SMenu.model.User;
import com.SMenu.SMenu.model.UserInfo;
import com.SMenu.SMenu.repository.UserAccountRepository;
import com.SMenu.SMenu.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserAccountRepository userAccountRepository;
    private final UserInfoRepository userInfoRepository;

    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;


    public User signup(RegisterDTO input) {
        User user = new User();
        UserInfo userInfo = new UserInfo();

        userInfo.setName(input.getName());
        userInfo.setEmail(input.getEmail());
        userInfo.setDestination(input.getDestination());
        userInfo.setPhoneNumber(input.getPhoneNumber());
        userInfo= userInfoRepository.save(userInfo);

        user.setUserName(input.getUserName());
        user.setPassword(passwordEncoder.encode(input.getPassword()));
        user.setUserInfoId(userInfo.getId());
        user.setStatus("active");
        user.setAccountType("normal_user");

        return userAccountRepository.save(user);
    }

    public User authenticate(LoginDTO input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getUserName(),
                        input.getPassword()
                )
        );

        return userAccountRepository.findByUserName(input.getUserName())
                .orElseThrow();
    }}