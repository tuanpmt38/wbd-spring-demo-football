package com.codegym.football.service;

import com.codegym.football.model.FootballClub;

public interface FootballService {

    Iterable<FootballClub> findAll();

    FootballClub findById(Long id);

    void save (FootballClub footballClub);

    void remove (Long id);
}
