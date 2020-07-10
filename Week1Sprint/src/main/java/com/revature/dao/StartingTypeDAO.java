package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.Player;
import com.revature.entity.StartingType;

@Repository
public interface StartingTypeDAO extends JpaRepository <StartingType, Integer> {

	public StartingType findStartingTypeByTypeId(int typeId);
}
