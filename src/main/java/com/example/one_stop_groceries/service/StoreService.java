package com.example.one_stop_groceries.service;

import com.example.one_stop_groceries.dao.StoreDAO;
import com.example.one_stop_groceries.entity.Store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    private final StoreDAO storeDAO;

    @Autowired
    public StoreService(StoreDAO storeDAO) {
        this.storeDAO = storeDAO;
    }

    // Method to add a store
    public void addStore(Store store) {
        storeDAO.addStore(store);
    }

    public List<Store> getAllStores() {
        return storeDAO.getAllStores();
    }
}
