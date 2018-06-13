package com.codegym.football.repository;

import com.codegym.football.model.FootballPlayer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FootballPlayerRepository extends PagingAndSortingRepository<FootballPlayer, Long> {
}
