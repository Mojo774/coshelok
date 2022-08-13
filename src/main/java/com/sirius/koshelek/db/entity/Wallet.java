package com.sirius.koshelek.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table
@Entity(name = "wallet")
@SequenceGenerator(allocationSize = 1, name = "wallet_seq", sequenceName = "wallet_seq")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wallet_seq")
    private Long id;
    private Long userId;

    private String name;
    private Long currency;
    private Double limit;
    private Double balance;
    private Double income;
    private Double outcome;
}
