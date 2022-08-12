package com.sirius.koshelek.db.entity;

import com.sirius.koshelek.model.OperationType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table
@Entity(name = "category")
@SequenceGenerator(allocationSize = 1, name = "category_seq", sequenceName = "category_seq")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
    private Long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    private Integer icon;
    private Integer color;
}
