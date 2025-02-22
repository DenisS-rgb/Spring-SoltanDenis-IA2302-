package com.example.lab1.model;

import java.util.Objects;

public class Order {
    private int orderId;
    private String customerName;
    private String address;
    private double totalPrice;
    private boolean isDelivered;

    public Order() {
    }

    public Order(int orderId, String customerName, String address, double totalPrice, boolean isDelivered) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.address = address;
        this.totalPrice = totalPrice;
        this.isDelivered = isDelivered;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", totalPrice=" + totalPrice +
                ", isDelivered=" + isDelivered +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId &&
                Double.compare(order.totalPrice, totalPrice) == 0 &&
                isDelivered == order.isDelivered &&
                Objects.equals(customerName, order.customerName) &&
                Objects.equals(address, order.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerName, address, totalPrice, isDelivered);
    }
}
