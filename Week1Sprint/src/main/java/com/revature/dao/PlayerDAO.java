package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.Player;

@Repository
public interface PlayerDAO extends JpaRepository <Player, Integer> {

		public Player findPlayerByPlayerId(int playerId);
}
