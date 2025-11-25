package com.example.javadatabasefinal.repository;

import com.example.javadatabasefinal.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    Store findByid(Long id);
    @Query("SELECT p FROM Store p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :pname, '%'))")
    List<Store> findBySubName(String pname);
}
