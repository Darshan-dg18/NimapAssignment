package com.Nimap.nimap.Entity;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String price;
    private String quantity;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public String getQuantity(){
        return quantity;
    }
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    // Remove this incorrect constructor declaration
    public void Product(){}
    
    // Add this proper constructor
    public Product() {}


}
