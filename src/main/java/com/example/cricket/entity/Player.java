package com.example.cricket.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EntityScan
@Entity
@Getter @Setter @NoArgsConstructor
public class Player {
 private PlayerRole role;
 private String playerName;
 @ManyToOne
 @JoinColumn(name = "team_fk")
 private Team team;


}
