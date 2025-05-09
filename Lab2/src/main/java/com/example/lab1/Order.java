package com.example.lab1;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Order {
    private Long orderId;
    @NonNull  // (constructorul necesar de Lombok)
    private MenuItem menuItem;
}
