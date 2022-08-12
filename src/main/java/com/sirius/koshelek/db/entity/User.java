package com.sirius.koshelek.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table
@Entity(name = "user")
@SequenceGenerator(allocationSize = 1, name = "user_seq", sequenceName = "user_seq")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;

    private String name;
    private String login;
}
