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
import com.revature.service.StartingTypeService;

@RestController
@RequestMapping("/startingtype")
@CrossOrigin
public class StartingTypeController {

	@Autowired
	StartingTypeService stservice;

	
    @RequestMapping(value = "/new", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody()
	public StartingType addStartingType (@RequestBody StartingType st) {
    	return this.stservice.addStartingType(st);
    }
    
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<StartingType> getAllST() {
		return this.stservice.getAllST();
	}
}
