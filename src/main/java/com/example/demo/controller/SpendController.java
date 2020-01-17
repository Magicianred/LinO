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

    /* List all spend */
    @GetMapping
    public ResponseEntity<List<Spend>> listSpend () {
        return new ResponseEntity<List<Spend>>(
                spendRepository.findAll(), HttpStatus.OK
        );
    }

    /* Find spend by user */
    @GetMapping(path = {"/user/{id}"})
    public ResponseEntity<List<Spend>> listSpendByUser (@PathVariable Long id) {
        return new ResponseEntity<List<Spend>>(
                spendRepository.findByReceiverIdIs(id), HttpStatus.OK
        );
    }

    /* Delete spend by id */
    @DeleteMapping(path = {"/{id}"})
    public void delete (@PathVariable Long id) {
        spendRepository.findById(id)
                .map(record -> {
                    record.setPayer(null);
                    record.setReceiver(null);
                    record.setUserGroup(null);
                    spendRepository.deleteById(id);
                    return null;
                }).orElse(ResponseEntity.notFound().build());
    }

    /* Update info into the wallet */
    @PutMapping(value = "/{id}")
    public ResponseEntity update (@PathVariable("id") long id,
                                  @RequestBody Spend spend) {
        return spendRepository.findById(id)
                .map(record -> {
                    record.setUserGroup(spend.getUserGroup());
                    record.setPayer(spend.getPayer());
                    record.setReceiver(spend.getReceiver());
                    record.setCategory(spend.getCategory());
                    record.setDate(spend.getDate());
                    record.setName(spend.getName());
                    record.setValue(spend.getValue());
                    Spend updated = spendRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
}
