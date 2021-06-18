package com.example.cricket.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class MatchScoreCard {
    @ManyToOne
    @JoinColumn(name = "team_Fk")
    private Team team;
    @JoinColumn(name = "player_Fk")
    private Player player;
    private Integer noOfBalls;
    private Integer noOfWickets;
    private Integer noOfExtras;
    private Integer runs;
    private String wayOfDismissal;
    @JoinColumn(name = "out_player_fk")
    private Player outPlayer;
    @ManyToOne
    @JoinColumn(name="match_Fk")
    private Match match;
}
