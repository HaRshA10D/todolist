package com.harsha.learnj.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    @NotNull
    String name;

    @NotNull
    String orgID;

    @NotNull
    String nickName;
}
