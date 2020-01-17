package com.example.demo.business;

import com.example.demo.model.Spend;
import com.example.demo.model.User;
import com.example.demo.model.UserGroup;
import com.example.demo.repository.SpendRepository;
import com.example.demo.repository.UserGroupRepository;
import com.example.demo.repository.UserRepository;
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
        User payer = userRepository.findById(spend.getPayer().getId()).orElse(null);
        User receiver = userRepository.findById(spend.getReceiver().getId()).orElse(null);

        if (userGroup != null) {
            spend.setUserGroup(userGroup);
            spend.setPayer(payer);
            spend.setReceiver(receiver);
            spendRepository.save(spend);
            return spend;
        } else {
            System.out.println("Gasto nulo");
            return null;
        }
    }
}
