package com.example.demo.modal.dto;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class RoleStageMapUsers {
    private Integer mappingId; // Unique identifier for the mapping
    private String stageName; // Comma-separated user IDs
    private String roleName; // Role name for display purposes
}
