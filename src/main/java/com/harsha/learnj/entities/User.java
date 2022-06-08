package com.harsha.learnj.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    @NotNull
    String name;

    @NotNull
    @Column(name = "org_id")
    String orgID;

    @NotNull
    @Column(name = "nick_name")
    String nickName;
}
