// src/main/java/com/example/one-stop-groceries/controller/StoreController.java
package com.example.one_stop_groceries.controller;

import com.example.one_stop_groceries.entity.Store;
import com.example.one_stop_groceries.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping
    public String viewStores(Model model) {
        model.addAttribute("stores", storeService.getAllStores());
        return "viewStores";
    }

    @GetMapping("/manage")
    public String manageStores(Model model) {
        model.addAttribute("store", new Store());
        model.addAttribute("stores", storeService.getAllStores());
        return "manageStores";
    }

    @PostMapping("/add")
    public String addStore(@ModelAttribute Store store) {
        storeService.addStore(store);
        return "redirect:/stores";
    }

    @PostMapping("/update")
    public String updateStore(@ModelAttribute Store store) {
        storeService.updateStore(store);
        return "redirect:/stores";
    }

    @GetMapping("/delete/{id}")
    public String deleteStore(@PathVariable Long id) {
        storeService.deleteStore(id);
        return "redirect:/stores";
    }

    @GetMapping("/edit/{id}")
    public String editStore(@PathVariable Long id, Model model) {
        // 使用 StoreService 根据 ID 获取商店
        Store store = storeService.getStoreById(id)
                .orElseThrow(() -> new RuntimeException("未找到 ID 为 " + id + " 的商店"));
        model.addAttribute("store", store);
        model.addAttribute("stores", storeService.getAllStores()); // 可选：显示所有商店
        return "manageStores"; // 返回 manageStores.jsp 进行编辑
    }
}