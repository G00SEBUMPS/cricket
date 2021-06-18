package com.example.cricket.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Innings {
    private Integer inningNumber;
    @ManyToOne
    @JoinColumn(name = "batting_team_fk")
    private Team battingTeam;
    @ManyToOne
    @JoinColumn(name = "bowling_team_fk")
    private Team bowlingTeam;
    @OneToMany(mappedBy = "match")
    private List<MatchScoreCard> scoreCardList;
    @ManyToOne
    @JoinColumn(name = "match_fk")
    private Match match;


}
