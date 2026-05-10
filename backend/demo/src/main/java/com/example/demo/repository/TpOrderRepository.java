package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modal.TpOrder;



@Repository
public interface TpOrderRepository extends JpaRepository<TpOrder, Integer> {


}