package com.example.demo.controller;

import com.example.demo.business.SpendBusiness;
import com.example.demo.model.Spend;
import com.example.demo.repository.SpendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/spend")

@RestController
public class SpendController {

    @Autowired
    private SpendRepository spendRepository;

    @Autowired
    private SpendBusiness spendBusiness;

    /* Insert new spend. */
    @PostMapping
    public Spend insert (@RequestBody Spend spend) {
        return spendBusiness.save(spend);
    }

    /* List all users */
    @GetMapping
    public ResponseEntity<List<Spend>> listSpend () {
        return new ResponseEntity<List<Spend>>(
                spendRepository.findAll(), HttpStatus.OK
        );
    }

    /* Delete spend by id */
    @DeleteMapping(path = {"/{id}"})
    public void delete (@PathVariable Long id) {
        spendRepository.findById(id)
                .map(record -> {
                    record.setUser(null);
                    record.setUserGroup(null);
                    spendRepository.deleteById(id);
                    return null;
                }).orElse(ResponseEntity.notFound().build());
    }
}
