package com.example.demo.modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.demo.modal.enums.WorkflowStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tp_order_workflow")
public class TpOrderWorkflow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private TpOrder order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mapping_id", nullable = false)
    private TpRoleStageConfig mapping;

    @Column(name = "step_sequence", nullable = false)
    private Integer stepSequence = 1;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private WorkflowStatus status = WorkflowStatus.pending;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "claimed_by_user_id")
    private IdaUser claimedByUser;

    @Column(name = "tp_impact_value", precision = 15, scale = 2)
    private BigDecimal tpImpactValue = BigDecimal.ZERO;

    @Column(name = "uploaded_file_url", length = 255)
    private String uploadedFileUrl;

    @Column(name = "uploaded_file_name", length = 255)
    private String uploadedFileName;

    @Column(name = "comments", columnDefinition = "TEXT")
    private String comments;

    @Column(name = "started_at")
    private LocalDateTime startedAt;

    @Column(name = "completed_at")
    private LocalDateTime completedAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}