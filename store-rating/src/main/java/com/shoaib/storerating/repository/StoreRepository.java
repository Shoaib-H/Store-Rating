package com.shoaib.storerating.repository;

import com.shoaib.storerating.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}