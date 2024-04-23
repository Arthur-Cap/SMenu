package com.SMenu.SMenu.repository;

import com.SMenu.SMenu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAccountRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);

}
