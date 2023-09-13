package com.evoke.myntra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evoke.myntra.entity.DiscountEntity;

public interface DiscountRepository extends JpaRepository<DiscountEntity, Long> {

}
