package com.melee.webapp.meleewebapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melee.webapp.meleewebapp.model.Player;
import com.melee.webapp.meleewebapp.repository.PlayerRepository;

@Service
public class PlayerService{

	@Autowired
	PlayerRepository playerRepository;
	
	public List<Player> getAllPersons(){
		List<Player> persons = new ArrayList<Player>();
        playerRepository.findAll().forEach(person -> persons.add(person));
        return persons;
	}
}
