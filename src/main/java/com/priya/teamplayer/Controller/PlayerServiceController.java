package com.priya.teamplayer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.priya.teamplayer.Model.Player;
import com.priya.teamplayer.Service.PlayerService;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@RestController
@RequestMapping(value="cricket/")
public class PlayerServiceController {
	
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(value = "/team/{team_Id}", method = RequestMethod.GET)
	public Iterable<Player> getPlayersByTeam(@PathVariable("teamId") Integer teamId) {
		return playerService.getPlayerByTeam(teamId);
	}

	@RequestMapping(value = "/player/{playerId}", method = RequestMethod.GET)
	public Player getPlayer(@PathVariable("playerId") Integer playerId) {
		return playerService.getPlayer(playerId);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void savePlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
	}

	@RequestMapping(value = "/delete/{playerId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePlayer(@PathVariable("playerId") Integer playerId) {
		playerService.deletePlayer(new Player(playerId));
	}
	

}
