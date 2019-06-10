package com.melee.webapp.meleewebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.melee.webapp.meleewebapp.model.Player;
import com.melee.webapp.meleewebapp.service.PlayerService;

@RestController
public class PlayerController {

	
	@Autowired
	PlayerService playerService;
	
	@GetMapping(value = "/all_players", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Player> getAllPlayers(){
		return playerService.getAllPersons();
	}

	@GetMapping(value = "/players", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Page<Player> getPlayers(@RequestParam(value = "pageNum", required = false) Integer page, 
			@RequestParam(value = "pageSize", required = false) Integer pageSize){
		if(page == null || page < 0) {
			page = 0;
		}
		if(pageSize == null || pageSize < 1) {
			pageSize = 20;
		}
		return playerService.getPlayers(page, pageSize);
	}

}
