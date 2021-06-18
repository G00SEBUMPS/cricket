package com.example.cricket.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Match {
    private MatchType type;
    @OneToOne
    @JoinColumn(name = "team1_fk")
    private TeamRoster team1;
    @OneToOne
    @JoinColumn(name = "team2_fk")
    private TeamRoster team2;
    @OneToMany(mappedBy = "match")
    private List<Innings> innings;
    private Integer numberOfDays;
    private Integer numberOfInnings;
    @ManyToOne
    @JoinColumn(name = "referee_fk")
    private Umpire referee;
    @ManyToMany
    private Set<Umpire> umpires;
    private Result result;
    private Integer teamWon;  //1 for team1   2 for team2
    private MatchFormat format;
    private Venue venue;

}
