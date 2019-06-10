package com.melee.webapp.meleewebapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang.builder.ToStringBuilder;

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
	
	
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}



	public String getGamerTag() {
		return gamerTag;
	}



	public void setGamerTag(String gamerTag) {
		this.gamerTag = gamerTag;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Date getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
