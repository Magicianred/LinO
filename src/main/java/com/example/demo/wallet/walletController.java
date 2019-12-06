package com.example.demo.wallet;

import com.example.demo.model.User;
import com.example.demo.model.Wallet;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/wallet")

@RestController
public class walletController {

    @Autowired
    private WalletRepository walletRepository;

    /* Insere nova carteira. */
    @PostMapping
    public Wallet insert(@RequestBody Wallet wallet){
        return walletRepository.save(wallet);
    }



    /* Informa o saldo atual de um usuário. */
    @GetMapping
    public ResponseEntity<List<Wallet>> verifyWallet() {
        return new ResponseEntity<List<Wallet>>(
                walletRepository.findAll(), HttpStatus.OK
        );
    }

    /* Atualiza informações sobre os gastos de um grupo. */
    @PostMapping("/{id}")
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