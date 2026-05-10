package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import com.example.demo.modal.dto.RoleStageMapUsers;
import com.example.demo.repository.TpRoleStageConfigRepository;

import java.util.List;

@RestController
@RequestMapping("/stagerolemap")
@RequiredArgsConstructor
public class StageRoleMapController {
    
    private final TpRoleStageConfigRepository tpRoleStageConfigRepository;

    @GetMapping("/all")
    public ResponseEntity<List<RoleStageMapUsers>> getAllMappings() {
        
        // 1. Fetch the raw List from the repository, do NOT try to assign it to a ResponseEntity yet.
        List<RoleStageMapUsers> mappings = tpRoleStageConfigRepository.findRoleStageMappings();
        
        // 2. Wrap the List in a ResponseEntity and return it.
        return ResponseEntity.ok(mappings);
    }
}