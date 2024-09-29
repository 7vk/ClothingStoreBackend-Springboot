package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
    private Long productId;
    private String productName;
    private String description;
    private Double price;
    private String specialPrice;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
}
