package com.codegym.football.repository;

import com.codegym.football.model.FootballClub;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FootballClubRepository extends PagingAndSortingRepository<FootballClub, Long> {
}
