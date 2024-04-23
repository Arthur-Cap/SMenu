package com.SMenu.SMenu.repository;

import com.SMenu.SMenu.model.User;
import com.SMenu.SMenu.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

}
