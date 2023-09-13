package com.evoke.myntra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.evoke.myntra.entity.PriceEntity;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {

}
