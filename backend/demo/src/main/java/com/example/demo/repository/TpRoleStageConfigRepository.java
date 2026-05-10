package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.TpRoleStageConfig;
import com.example.demo.modal.dto.RoleStageMapUsers;

import java.util.List;
import java.util.Optional;

@Repository
public interface TpRoleStageConfigRepository extends JpaRepository<TpRoleStageConfig, Integer> {

    // 1. Find all active or inactive mappings for a specific Stage
    List<TpRoleStageConfig> findByStageId(Integer stageId);


    // 2. Find all stages assigned to a specific Role
    
    List<TpRoleStageConfig> findByRole_Slno(Integer roleId);

    // 3. Find a specific unique mapping between a Stage and a Role
    // Looks for stage.id AND role.slno
    Optional<TpRoleStageConfig> findByStage_IdAndRole_Slno(Integer stageId, Integer roleSlno);

    // 4. Find all mappings that are currently active
    List<TpRoleStageConfig> findByIsActiveTrue();
    

    // 6. Find all role-stage mappings with their names
    @Query("SELECT new com.example.demo.modal.dto.RoleStageMapUsers(r.id, s.stageName, ro.roleName) FROM TpRoleStageConfig r JOIN r.stage s JOIN r.role ro")
    List<RoleStageMapUsers> findRoleStageMappings();



    


}