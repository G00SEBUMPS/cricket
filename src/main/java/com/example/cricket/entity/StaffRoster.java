package com.example.cricket.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StaffRoster {
    @ManyToOne
    @JoinColumn(name = "staff")
    private Staff staff;
    @ManyToOne
    @JoinColumn(name="team")
    private TeamRoster team;
}
