package com.example.cricket.entity;

import javax.persistence.Entity;

@Entity
public class Venue {
    private String name;
    private Country country;
    private City city;
    private Integer capacity;
    private String facilities;
}
