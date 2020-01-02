package com.example.demo.wallet;

import com.example.demo.business.WalletBusiness;
import com.example.demo.dto.WalletDTO;
import com.example.demo.dto.WalletResponseDTO;
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

    @Autowired
    private WalletBusiness walletBusiness;

    /* Insert new wallet. */
    @PostMapping
    public ResponseEntity<Wallet> insert(@RequestBody WalletDTO dto) {
        Wallet wallet = walletBusiness.save(dto.fromDTO());
        return new ResponseEntity<>(wallet, HttpStatus.CREATED);
    }

    /* Info about wallet */
    @GetMapping
    public ResponseEntity<List<Wallet>> verifyWallet () {
        List<Wallet> wallet = walletRepository.findAll();
        System.out.println("LIST \n\n"+wallet+"\n\n");
        return new ResponseEntity<List<Wallet>>(
                wallet, HttpStatus.OK
        );
    }

    /* Delete wallet by id */
    @DeleteMapping(path = {"/{id}"})
    public void delete (@PathVariable Long id) {
        walletRepository.deleteById(id);
    }

    /* Get info from the wallet */
    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById (@PathVariable Long id) {
        return walletRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    /* Update info into the wallet */
    @PutMapping(value = "/{id}")
    public ResponseEntity update (@PathVariable("id") long id,
                                  @RequestBody Wallet wallet) {
        return walletRepository.findById(id)
                .map(record -> {
                    record.setBalance(wallet.getBalance());
                    record.setToPay(wallet.getToPay());
                    record.setToReceive(wallet.getToReceive());
                    Wallet updated = walletRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
}