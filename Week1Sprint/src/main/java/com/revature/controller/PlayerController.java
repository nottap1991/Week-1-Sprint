package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.Player;
import com.revature.entity.StartingType;
import com.revature.service.PlayerService;
import com.revature.service.StartingTypeService;

@RestController
@RequestMapping("/player")
@CrossOrigin
public class PlayerController {
	
	@Autowired
	PlayerService playerservice;
	StartingTypeService stservice;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Player> getAllPlayer() {
		return this.playerservice.getAllPlayer();
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody()
	public Player addPlayer (@RequestBody Player p) {
    	return this.playerservice.addPlayer(p);
    }
	
	@RequestMapping(value = "/weapon", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody()
	public StartingType weapon (@RequestBody Player p) {
    	Player x = playerservice.findById(p.getPlayerId());
    	int y = x.getTypeId();
    	System.out.println(y);
    	StartingType z = stservice.weapon(y);
    	return z;
    }
}
