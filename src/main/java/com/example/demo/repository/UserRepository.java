package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User, Long> {

    User findByLoginAndPassword(String login, String password);

    List<User> findByNameIs(String name);

    List<User> findByNameEquals(String name);
}
