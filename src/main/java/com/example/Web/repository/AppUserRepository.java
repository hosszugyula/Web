package com.example.Web.repository;

import com.example.Web.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String userName);

    String getPasswordOnlyById(Long id);

    boolean existsByUserName(String username);

}
