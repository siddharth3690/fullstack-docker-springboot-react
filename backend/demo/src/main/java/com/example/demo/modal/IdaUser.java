package com.example.demo.modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "idausers")
public class IdaUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer slno;

    @Column(name = "ntid", length = 45)
    private String ntId;

    @Column(name = "employeename", length = 100)
    private String employeeName;

    @Column(name = "department", length = 100)
    private String department;

    @Column(name = "employeeemailid", length = 100)
    private String employeeEmailId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleid")
    private RoleDetails role;

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

    @Column(name = "ldapstatus")
    private Integer ldapStatus;

    @Column(name = "password", length = 45)
    private String password;

    @Column(name = "userstatus")
    private Integer userStatus;

    @Column(name = "valuestreamid")
    private Integer valueStreamId;
}