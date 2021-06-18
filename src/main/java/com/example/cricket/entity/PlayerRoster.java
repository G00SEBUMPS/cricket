package com.example.cricket.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PlayerRoster {
    @OneToMany
    @JoinColumn(name = "team")
    private Team team;
    @ManyToOne
    @JoinColumn(name = "player")
    private Player player;
    private Boolean healthy;
    private Boolean mainRoster;
    @ManyToOne
    @JoinColumn(name ="replaced_by")
    private Player replacedBy;
}
