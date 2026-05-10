package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modal.RoleDetails;


@Repository
public interface RoleDetailRepository extends JpaRepository<RoleDetails, Integer> {


}