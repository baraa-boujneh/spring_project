package org.horizonefele.webMVC.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity

public class Team implements Serializable {
	@Id @GeneratedValue
	private Long idTeam;
	@Column(length=100)
	private String name;

	private Float budget;
	
	

public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

public Team(String name, Float budget) {
	super();
	
	this.name = name;
	this.budget = budget;
	
}

public String getName() {
	return name;
}

public Long getIdTeam() {
	return idTeam;
}

public void setIdTeam(Long idTeam) {
	this.idTeam = idTeam;
}

public Float getBudget() {
	return budget;
}

public void setBudget(Float budget) {
	this.budget = budget;
}

public void setName(String name) {
	this.name = name;
}


}





 

