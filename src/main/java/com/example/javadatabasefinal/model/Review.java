package com.example.javadatabasefinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.ISBN;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotNull
    private Long customerId;
    @NotNull
    private Long productId;
    @NotNull
    private Long storeId;

    @Min(1)
    @Max(5)
    @NotNull
    private Integer rating;

    private String comment;

    public Review() {
    }

    public Review(@NotNull Long productId, @NotNull Long storeId, @NotNull Integer rating) {
        this.productId = productId;
        this.storeId = storeId;
        this.rating = rating;
    }

    public Review(@NotNull Long productId, @NotNull Long storeId, @NotNull Integer rating, String comment) {
        this.productId = productId;
        this.storeId = storeId;
        this.rating = rating;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
