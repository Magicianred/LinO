package com.example.demo.business;

import com.example.demo.model.Spend;
import com.example.demo.model.User;
import com.example.demo.model.UserGroup;
import com.example.demo.model.Wallet;
import com.example.demo.repository.SpendRepository;
import com.example.demo.repository.UserGroupRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpendBusiness {

    @Autowired
    private SpendRepository spendRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserGroupRepository userGroupRepository;

    public Spend save (Spend spend) {

        UserGroup userGroup = userGroupRepository.findById(spend.getUserGroup().getId()).orElse(null);
        User user = userRepository.findById(spend.getUser().getId()).orElse(null);

        if (userGroup != null && user != null) {
            spend.setUserGroup(userGroup);
            spend.setUser(user);
            spendRepository.save(spend);
            return spend;
        } else {
            System.out.println("Gasto nulo");
            return null;
        }
    }
}
