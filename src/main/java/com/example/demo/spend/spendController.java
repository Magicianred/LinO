package com.example.demo.spend;

import com.example.demo.model.Spend;
import com.example.demo.repository.SpendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/spend")

@RestController
public class spendController {

    @Autowired
    private SpendRepository newRepository;

    /* Insere um novo usuário. */
    @PostMapping
    public Spend insert(@RequestBody Spend spend) {
        return newRepository.save(spend);
    }
}
