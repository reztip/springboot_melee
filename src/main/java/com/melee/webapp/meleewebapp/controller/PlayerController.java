package com.melee.webapp.meleewebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melee.webapp.meleewebapp.model.Player;
import com.melee.webapp.meleewebapp.service.PlayerService;

@RestController
public class PlayerController {

	
	@Autowired
	PlayerService playerService;
	
	@GetMapping("/players")
	public List<Player> getPlayers(){
		return playerService.getAllPersons();
	}

}
