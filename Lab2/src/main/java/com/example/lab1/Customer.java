package com.example.lab1;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Long id;
    private String name;
    private Order order;

    // Injectare prin constructor
    @Autowired
    public Customer(Order order) {
        this.order = order;
    }

    // Injectare prin setter
    @Autowired
    public void setOrder(Order order) {
        this.order = order;
    }
}
