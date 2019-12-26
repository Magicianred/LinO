package com.example.demo.wallet;

import com.example.demo.model.Wallet;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletRepository walletRepository;

    /* Insere nova carteira. */
    @PostMapping
    public Wallet insert(@RequestBody Wallet wallet) {
        return walletRepository.save(wallet);
    }

    /* Informa o saldo atual de um usuário. */
    @GetMapping
    public ResponseEntity<List<Wallet>> verifyWallet() {
        return new ResponseEntity<List<Wallet>>(
                walletRepository.findAll(), HttpStatus.OK
        );
    }

    /* Delete wallet by id */
    @DeleteMapping(path = {"/{id}"})
    public void delete(@PathVariable Long id){
        walletRepository.deleteById(id);
    }

    /* Atualiza informações sobre os gastos de um grupo. */
    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable Long id){
        return walletRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}