package com.example.demo.business;

import com.example.demo.model.Spend;
import com.example.demo.model.UserGroup;
import com.example.demo.model.Wallet;
import com.example.demo.repository.SpendRepository;
import com.example.demo.repository.UserGroupRepository;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpendBusiness {

    @Autowired
    private SpendRepository spendRepository;

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private UserGroupRepository userGroupRepository;

    public Spend save (Spend spend) {

        UserGroup userGroup = userGroupRepository.findById(spend.getUserGroup().getId()).orElse(null);
        Wallet wallet = walletRepository.findById(spend.getWallet().getId()).orElse(null);

        if (userGroup != null && wallet != null) {
            spend.printSpend();
            spend.setUserGroup(userGroup);
            spend.printSpend();
            spend.setWallet(wallet);
            spendRepository.save(spend);
            return spend;
        } else {
            System.out.println("Gasto nulo");
            return null;
        }
    }
}
