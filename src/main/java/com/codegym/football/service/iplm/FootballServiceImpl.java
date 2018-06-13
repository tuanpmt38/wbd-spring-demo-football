package com.codegym.football.service.iplm;

import com.codegym.football.model.FootballClub;
import com.codegym.football.repository.FootballClubRepository;
import com.codegym.football.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;

public class FootballServiceImpl implements FootballService {

    @Autowired
    private FootballClubRepository footballClubRepository;
    @Override
    public Iterable<FootballClub> findAll() {
        return footballClubRepository.findAll();
    }

    @Override
    public FootballClub findById(Long id) {
        return footballClubRepository.findOne(id);
    }

    @Override
    public void save(FootballClub footballClub) {
        footballClubRepository.save(footballClub);
    }

    @Override
    public void remove(Long id) {
        footballClubRepository.delete(id);
    }
}
