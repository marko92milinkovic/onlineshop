package com.shop.app.catalog.dto;

public class Product {

    private Long id;
    private String isbn;
    private String name;

    public Product() {
    }

    public Product(Long id, String isbn, String name) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
