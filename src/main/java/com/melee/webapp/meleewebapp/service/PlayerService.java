package com.melee.webapp.meleewebapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.melee.webapp.meleewebapp.model.Player;
import com.melee.webapp.meleewebapp.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;
	
	public List<Player> getAllPersons(){
		List<Player> persons = new ArrayList<Player>();
        playerRepository.findAll().forEach(person -> persons.add(person));
        return persons;
	}
	
	
	public Page<Player> getPlayers(int pageNum, int pageSize){
		Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<Player> players = playerRepository.findAll(pageable);
        return players;
	}
}
