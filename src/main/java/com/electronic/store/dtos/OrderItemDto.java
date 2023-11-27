package com.electronic.store.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrderItemDto {
    private int orderItemId;
    private int quantity;
    private int totalAmount;
    private ProductDto product;
}
