package com.example.cricket.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class TeamRoster {
    @ManyToOne
    @JoinColumn(name = "team")
    private Team team;
    @OneToMany(mappedBy = "team")
    private Set<PlayerRoster> players;
    @OneToMany(mappedBy = "team")
    private StaffRoster manager;
    @OneToMany(mappedBy = "team")
    private StaffRoster coach;
    @OneToMany(mappedBy = "team")
    private Set<StaffRoster> supportStaff;
}
