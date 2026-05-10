package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modal.TpOrderWorkflow;


@Repository
public interface TpOrderWorkflowRepository extends JpaRepository<TpOrderWorkflow, Integer> {


}