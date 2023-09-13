package com.evoke.myntra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evoke.myntra.entity.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity, Long> {

}
