package com.codegym.football.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "footballclub")
public class FootballClub {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(targetEntity = FootballPlayer.class)
    List<FootballPlayer> footballPlayers;

    public FootballClub(){}

    public FootballClub(String name) {
        this.name = name;
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

    public List<FootballPlayer> getFootballPlayers() {
        return footballPlayers;
    }

    public void setFootballPlayers(List<FootballPlayer> footballPlayers) {
        this.footballPlayers = footballPlayers;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                ", name='" + name + '\'' +
                ", footballPlayers=" + footballPlayers +
                '}';
    }
}
