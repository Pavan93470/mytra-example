
package com.evoke.myntra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.evoke.myntra.entity.OrderResponseEntity;

@Repository
public interface OrderResponseRepository extends JpaRepository<OrderResponseEntity, Long> {

}
