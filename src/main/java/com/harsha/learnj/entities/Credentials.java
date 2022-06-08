package com.harsha.learnj.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "credentials")
public class Credentials extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "user_id", unique = true, nullable = false)
    private Long userID;

    @NotNull
    private String salt;

    @NotNull
    private String hash;
}
