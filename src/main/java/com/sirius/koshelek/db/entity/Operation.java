package com.sirius.koshelek.db.entity;

import com.sirius.koshelek.model.OperationType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Table
@Entity(name = "operation")
@SequenceGenerator(allocationSize = 1, name = "operation_seq", sequenceName = "operation_seq")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "operation_seq")
    private Long id;
    private Long walletId;

    @Enumerated(EnumType.STRING)
    private OperationType type;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "categoryId")
    private Category category;
    private Integer currency;
    private Double sum;
    private LocalDateTime date;
}
