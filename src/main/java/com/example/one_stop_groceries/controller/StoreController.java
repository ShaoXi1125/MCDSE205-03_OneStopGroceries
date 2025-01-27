package com.example.one_stop_groceries.controller;

import com.example.one_stop_groceries.entity.Store;
import com.example.one_stop_groceries.service.StoreService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stores")
public class StoreController {
    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    // POST method to add a store
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addStore(@RequestBody Store store) {
        storeService.addStore(store);
        return "Store added successfully!";
    }

     @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }
}
