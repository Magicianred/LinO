package com.example.demo.wallet;

import com.example.demo.model.Wallet;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class walletController {

    @Autowired
    private WalletRepository walletRepository;
    /* Informa o saldo atual de um usuário. */
    @GetMapping("/")
    public ResponseEntity<String> Hello() {
        return new ResponseEntity<String>(
                "Hello!", HttpStatus.OK
        );
    }

    /* Informa o saldo atual de um usuário. */
    @GetMapping("/verifyWallet")
    public ResponseEntity<List<Wallet>> verifyWallet() {
        return new ResponseEntity<List<Wallet>>(
                walletRepository.findAll(), HttpStatus.OK
        );
    }

    /* Atualiza informações sobre os gastos de um grupo. */
    @PostMapping("/updateWallet")
    public ResponseEntity<String> updateWallet() {
        return new ResponseEntity<String>(
                "updateWallet", HttpStatus.OK
        );
    }

    /* Insere um novo gasto em um usuário. */
    @PostMapping("/insertSpendInWallet")
    public ResponseEntity<String> insertSpendInWallet() {
        return new ResponseEntity<String>(
                "insertSpendInWallet", HttpStatus.OK
        );
    }

    /* Insere um novo gasto em um usuário. */
    @PostMapping("/updateSpendInWallet")
    public ResponseEntity<String> updateSpendInWallet() {
        return new ResponseEntity<String>(
                "updateSpendInWallet", HttpStatus.OK
        );
    }
}