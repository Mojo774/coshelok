package com.sirius.koshelek.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table
@Entity(name = "currency")
@SequenceGenerator(allocationSize = 1, name = "currency_seq", sequenceName = "currency_seq")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_seq")
    private Long id;

    private String name;
    private String code;
}
