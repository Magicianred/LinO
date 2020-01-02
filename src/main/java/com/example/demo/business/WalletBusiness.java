package com.example.demo.business;

import com.example.demo.model.User;
import com.example.demo.model.Wallet;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WalletBusiness {

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private UserRepository userRepository;


    public Wallet save (Wallet wallet) {

        System.out.println("Wallet SAVER");
        User user = wallet.getUser();
        System.out.println("Wallet ID: "+wallet.getId()+"Wallet user: "+user.getId());
        user = userRepository.findById(user.getId()).orElse(null);
        if (user != null) {
            wallet.setUser(user);
            user.printUser();
            walletRepository.save(wallet);
            return wallet;

        } else {
            System.out.println("Usuário nulo");
            return null;
        }
    }
}
