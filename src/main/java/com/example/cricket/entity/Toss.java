package com.example.cricket.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Toss {
    private TossResult result;
    @OneToMany
    private PlayerRoster captainWon;
    @OneToMany
    private PlayerRoster captainLost;
    @OneToMany
    private Umpire umpire;
}
