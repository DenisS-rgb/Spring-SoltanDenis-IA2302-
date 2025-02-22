package com.example.lab1.controller;

import com.example.lab1.model.MenuItem;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private List<MenuItem> menuItems = new ArrayList<>();

    @GetMapping
    public List<MenuItem> getMenu() {
        return menuItems;
    }

    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem item) {
        menuItems.add(item);
        return item;
    }
}
