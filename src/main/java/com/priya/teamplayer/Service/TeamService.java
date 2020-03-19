package com.priya.teamplayer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priya.teamplayer.Model.Team;
import com.priya.teamplayer.Repository.TeamRepository;

	@Service
	public class TeamService {

		@Autowired
		private TeamRepository teamRepository;

		public Iterable<Team> getAllTeam() {
			return teamRepository.findAll();
		}

		public Team getTeam(Integer teamId) {
			return teamRepository.findOne(teamId);
		}

		public void saveTeam(Team team) {
			teamRepository.save(team);
		}

		public void deleteTeam(Team team) {
			teamRepository.delete(team.getTeam_id());
		}
	}


