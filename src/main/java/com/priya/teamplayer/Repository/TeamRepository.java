package com.priya.teamplayer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priya.teamplayer.Model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {

}
