package com.example.demo.modal;

import com.example.demo.modal.enums.WorkflowType;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tp_stages_master")
public class TpStageMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "stage_name", length = 100, nullable = false, unique = true)
    private String stageName;

    @Enumerated(EnumType.STRING)
    @Column(name = "workflow_type", nullable = false)
    private WorkflowType workflowType;
}