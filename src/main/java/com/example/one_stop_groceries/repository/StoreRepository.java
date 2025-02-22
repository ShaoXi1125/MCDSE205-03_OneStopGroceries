package com.example.one_stop_groceries.repository;

import com.example.one_stop_groceries.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}