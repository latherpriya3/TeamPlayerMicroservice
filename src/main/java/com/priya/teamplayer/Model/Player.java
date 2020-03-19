package com.priya.teamplayer.Model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "team")
public class Player implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "player_id", nullable = false)
	private Integer player_id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "shirt_number", nullable = false)
	private Integer shirt_number;
	
	@Column(name = "position", nullable = false)
	private String position;
	
	@ManyToOne
	@Column(name = "team_id", nullable = false)
	private Player team_id;
	
	public Integer getShirt_number() {
		return shirt_number;
	}

	public void setShirt_number(Integer shirt_number) {
		this.shirt_number = shirt_number;
	}

	
	
	public Player() {
		// dont remove
	}

	public Player(Integer playerId) {
		super();
		this.player_id = playerId;
	}
	
	
	public Integer getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(Integer player_id) {
		this.player_id = player_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Player getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Player team_id) {
		this.team_id = team_id;
	}

	

}
