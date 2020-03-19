package com.priya.teamplayer.Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="name")
public class Team implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "team_id", nullable = false)
	private Integer team_id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "country", nullable = false)
	private String country;
	
	public Team() {
		super();
	}

	public Team(final Integer teamId) {
		this.team_id = teamId;
	}
	
	public Integer getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

}
