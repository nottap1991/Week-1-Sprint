package com.revature.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER_TABLE")
public class Player {
	
	 @Column(name = "PLAYER_ID")
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO, generator = "PLAYER_PK_SEQ")
	 private int playerId;
	 
	 @Column(name = "PLAYER_NAME")
	 private String playerName;
	 
	 @Column(name = "PLAYER_GENDER")
	 private String playerGender;
	 
	 @Column(name = "TYPE_ID")
	 private int typeId;
	 
	 
	 

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String playerName, String playerGender, int typeId) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerGender = playerGender;
		this.typeId = typeId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerGender() {
		return playerGender;
	}

	public void setPlayerGender(String playerGender) {
		this.playerGender = playerGender;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerGender=" + playerGender
				+ ", typeId=" + typeId + "]";
	}
	 
	 
	 
}
