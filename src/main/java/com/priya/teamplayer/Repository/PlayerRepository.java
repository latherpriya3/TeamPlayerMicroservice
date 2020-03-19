package com.priya.teamplayer.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priya.teamplayer.Model.Player;
import com.priya.teamplayer.Model.Team;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
         public List<Player> findByTeam(Team team);
}
