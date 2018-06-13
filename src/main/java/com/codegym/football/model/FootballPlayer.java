package com.codegym.football.model;

import javax.persistence.*;

@Entity
@Table(name = "footballplayers")
public class FootballPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int age;
    private float height;
    private String country;
    private String position;

    @ManyToOne(targetEntity = FootballClub.class)
    @JoinColumn
    private FootballClub footballClub;

    public FootballPlayer(){}

    public FootballPlayer(Long id, String name, int age, float height, String country, String position, FootballClub footballClub) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.country = country;
        this.position = position;
        this.footballClub = footballClub;
    }

    public FootballPlayer(String name, int age, float height, String country, String position, FootballClub footballClub) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.country = country;
        this.position = position;
        this.footballClub = footballClub;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public FootballClub getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(FootballClub footballClub) {
        this.footballClub = footballClub;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", country='" + country + '\'' +
                ", position='" + position + '\'' +
                ", footballClub=" + footballClub +
                '}';
    }
}
