package com.revature.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STARTING_TYPE_TABLE")
public class StartingType {

	 @Column(name = "TYPE_ID")
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO, generator = "STARTING_TYPE_PK_SEQ")
	 private int typeId;
	    
	 @Column(name = "TYPE_NAME", unique = true)
	 private String typeName;
	    
	 @Column(name = "WEAPON")
	 private String weapon;
	 
	 

	public StartingType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public StartingType(int typeId, String typeName, String weapon) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.weapon = weapon;
	}



	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}



	@Override
	public String toString() {
		return "StartingType [typeId=" + typeId + ", typeName=" + typeName + ", weapon=" + weapon + "]";
	}
	 
	 

}
