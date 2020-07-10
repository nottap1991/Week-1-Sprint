package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.PlayerDAO;
import com.revature.entity.Player;

@Service
public class PlayerService {

	private PlayerDAO playerdao;
	
	@Autowired
	public PlayerService (PlayerDAO playerdao) {
		this.playerdao = playerdao;
	}
	
	public Player addPlayer (Player p) {
		return this.playerdao.save(p);
	}
	
	public List<Player> getAllPlayer(){
		return this.playerdao.findAll();
	}
	
	public Player findById(int playerId) {
		return this.playerdao.findPlayerByPlayerId(playerId);
	}
	
}
