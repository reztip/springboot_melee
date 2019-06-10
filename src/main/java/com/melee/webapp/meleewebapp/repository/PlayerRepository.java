package com.melee.webapp.meleewebapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.melee.webapp.meleewebapp.model.Player;

public interface PlayerRepository extends PagingAndSortingRepository<Player, String> {

}
