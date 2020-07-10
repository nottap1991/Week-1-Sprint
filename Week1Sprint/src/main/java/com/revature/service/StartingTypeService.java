package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.StartingTypeDAO;
import com.revature.entity.StartingType;

@Service
public class StartingTypeService {

	private StartingTypeDAO stdao;
	
	@Autowired
	public StartingTypeService(StartingTypeDAO stdao) {
		this.stdao = stdao;
	}
	
	public StartingType addStartingType (StartingType st) {
		return this.stdao.save(st);
	}
	
	public List<StartingType> getAllST(){
		return this.stdao.findAll();
	}
	
	public StartingType weapon (int typeId) {
		return this.stdao.findStartingTypeByTypeId(typeId);
	}
}
