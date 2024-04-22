package com.SMenu.SMenu.repository;

import com.SMenu.SMenu.model.AgencyAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgencyAccountRepository extends JpaRepository<AgencyAccount, Integer> {
    Optional<AgencyAccount> findByUserName(String userName);
}
