package com.example.one_stop_groceries.dao;

import com.example.one_stop_groceries.entity.Store;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StoreDAO {
    private List<Store> stores = new ArrayList<>();

    public void addStore(Store store) {
        stores.add(store);
    }

    public List<Store> getAllStores() {
        return stores;
    }
    
}
