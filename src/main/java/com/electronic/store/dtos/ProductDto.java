package com.electronic.store.dtos;

import com.electronic.store.entities.Category;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDto {
    private String productId;
    private String title;
    private String description;
    private int price;
    private int discountedPrice;
    private int quantity;
    private Date addedDate;
    private boolean live;
    private boolean stock;
    private String ProductImageName;
    private CategoryDto category;
}
