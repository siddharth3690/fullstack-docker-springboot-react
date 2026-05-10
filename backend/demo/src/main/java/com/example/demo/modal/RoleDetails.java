package com.example.demo.modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "roledetails")
public class RoleDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer slno;

    @Column(name = "roleName", length = 100)
    private String roleName;

    @Column(name = "createdby", length = 100)
    private String createdBy;

    @Column(name = "createddate")
    private LocalDateTime createdDate;

    @Column(name = "updatedby", length = 100)
    private String updatedBy;

    @Column(name = "updateddate")
    private LocalDateTime updatedDate;

    @Column(name = "deleteflag", columnDefinition = "INT(11) DEFAULT 0")
    private Integer deleteFlag = 0;
}