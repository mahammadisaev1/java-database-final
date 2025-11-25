package com.example.javadatabasefinal.repository;

import com.example.javadatabasefinal.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findByStoreIdAndProductId(Long storeId, Long productId);
}
