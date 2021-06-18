package com.example.cricket.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Team {
    private String name;
    private String owner;
    private TeamType type;


}
