package com.example.demo.repository;

import com.example.demo.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

// Estende pois ao declara a interface o spring gera todos os métodos de consulta ao banco.
public interface WalletRepository extends JpaRepository <Wallet, Long> {

}
