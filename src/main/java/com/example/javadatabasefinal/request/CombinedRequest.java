package com.example.javadatabasefinal.request;

import com.example.javadatabasefinal.model.Inventory;
import com.example.javadatabasefinal.model.Product;

public class CombinedRequest {
    private Product product;
    private Inventory inventory;

    // Boş constructor (JSON deserialization için gerekli)
    public CombinedRequest() {
    }

    // İstersen full constructor
    public CombinedRequest(Product product, Inventory inventory) {
        this.product = product;
        this.inventory = inventory;
    }

    // GETTER / SETTER'lar
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
