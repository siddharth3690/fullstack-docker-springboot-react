package com.example.demo.modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "tp_orders")
public class TpOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "planner_id", nullable = false)
    private IdaUser planner;

    @Column(name = "order_number", length = 50, nullable = false, unique = true)
    private String orderNumber;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "metadata", columnDefinition = "json")
    private Map<String, Object> metadata;

    @Column(name = "total_transfer_price", precision = 15, scale = 2)
    private BigDecimal totalTransferPrice = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    @Column(name = "current_overall_status")
    private OrderStatus currentOverallStatus = OrderStatus.planning;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}