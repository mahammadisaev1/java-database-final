package com.example.javadatabasefinal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message = "name cannot be null")
    private String name;
    @NotNull(message = "email cannot be null")
    private String email;
    @NotNull(message = "phone cannot be null")
    private String phone;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<OrderDetails> orderDetails;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
