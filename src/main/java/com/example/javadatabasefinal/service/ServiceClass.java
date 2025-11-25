package com.example.javadatabasefinal.service;

import com.example.javadatabasefinal.model.Inventory;
import com.example.javadatabasefinal.model.Product;
import com.example.javadatabasefinal.repository.InventoryRepository;
import com.example.javadatabasefinal.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceClass {
    private final InventoryRepository inventoryRepository;
    private final ProductRepository productRepository;
    public ServiceClass(InventoryRepository inventoryRepository,ProductRepository productRepository) {
        this.inventoryRepository = inventoryRepository;
        this.productRepository=productRepository;
    }
    public boolean validateInventory(Inventory inventory)
    {
        Inventory result=inventoryRepository.findByProductIdandStoreId(inventory.getProduct().getId(),inventory.getStore().getId());
        if(result!=null)
        {
            return false;
        }
        return true;
    }
    public boolean validateProduct(Product product)
    {
        Product result=productRepository.findByName(product.getName());
        if(result!=null)
        {
            return false;
        }
        return true;
    }
    public boolean ValidateProductId(long id)
    {
        Optional<Product> result=productRepository.findById(id);
        System.out.println(result);
        if(result==null)
        {
            return false;
        }
        return true;
    }
    public Inventory getInventoryId(Inventory inventory)
    {
        Inventory result=inventoryRepository.findByProductIdandStoreId(inventory.getProduct().getId(),inventory.getStore().getId());
        return result;
    }
}
