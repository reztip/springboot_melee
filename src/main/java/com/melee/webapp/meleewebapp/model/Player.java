package com.melee.webapp.meleewebapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PLAYER")
public class Player {

	@Id
	@Column(name = "GAMER_TAG", nullable = false)
	private String gamerTag;
	
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;
	
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;
	
	@Column(name = "DATE_OF_BIRTH", nullable = true)
	private Date dateOfBirth;
}
