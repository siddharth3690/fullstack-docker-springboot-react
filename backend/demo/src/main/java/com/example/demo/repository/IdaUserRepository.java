package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modal.IdaUser;


@Repository
public interface IdaUserRepository extends JpaRepository<IdaUser, Integer> {


    
}