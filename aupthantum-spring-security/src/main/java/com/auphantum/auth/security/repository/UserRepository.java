package com.auphantum.auth.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.auphantum.auth.model.security.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
