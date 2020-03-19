package com.priya.teamplayer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priya.teamplayer.Model.Player;
import com.priya.teamplayer.Model.Team;
import com.priya.teamplayer.Repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;

	public Player getPlayer(Integer playerId) {
		return playerRepository.findOne(playerId);
	}

	public List<Player> getPlayerByTeam(Integer teamId) {
		return playerRepository.findByTeam(new Team(teamId));
	}

	public void savePlayer(Player player) {
		playerRepository.save(player);
	}

	public void deletePlayer(Player player) {
		playerRepository.delete(player.getPlayer_id());
	}
}
