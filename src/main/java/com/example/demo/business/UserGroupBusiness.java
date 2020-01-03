package com.example.demo.business;

import com.example.demo.model.UserGroup;
import com.example.demo.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserGroupBusiness {

    @Autowired
    private UserGroupRepository userGroupRepository;

    public UserGroup save (UserGroup userGroup) {
        if (userGroup != null) {
            userGroupRepository.save(userGroup);
            return userGroup;
        } else {
            System.out.println("Grupo nulo");
            return null;
        }
    }
}
