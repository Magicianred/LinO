package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

// Estende pois ao declara a interface o spring gera todos os métodos de consulta ao banco.
public interface UserGroupRepository extends JpaRepository <UserGroup, Long> {

}
