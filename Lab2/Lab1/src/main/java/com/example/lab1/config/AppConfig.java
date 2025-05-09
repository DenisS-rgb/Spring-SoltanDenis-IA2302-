package com.example.lab1.config;
import com.example.lab1.Customer;
import com.example.lab1.MenuItem;
import com.example.lab1.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    // Definim un bean MenuItem prin configurare Java
    @Bean(name = "menuItemJavaBean")
    public MenuItem menuItemBean() {
        // Creăm un MenuItem cu anumite valori (exemplu)
        return new MenuItem("Pizza Margherita", 20.0);
    }

    // Definim un bean Order prin configurare Java, injectând MenuItem-ul de mai sus
    @Bean(name = "orderJavaBean")
    @Primary
    public Order orderBean() {
        // Folosim injecție prin constructor: apelăm constructorul Order(MenuItem)
        MenuItem menu = menuItemBean();
        Order order = new Order(menu);
        order.setOrderId(1001L);
        return order;
    }

    // Definim un bean Customer prin configurare Java, injectând Order-ul de mai sus
    @Bean(name = "customerJavaBean")
    public Customer customerBean() {
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("Ion Popescu");
        // Injecție prin setter: setăm dependința Order
        customer.setOrder(orderBean());
        return customer;
    }
}
