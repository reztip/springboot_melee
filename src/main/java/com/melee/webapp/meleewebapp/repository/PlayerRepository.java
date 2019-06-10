package com.melee.webapp.meleewebapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.melee.webapp.meleewebapp.model.Player;

public interface PlayerRepository extends CrudRepository<Player, String> {

}
