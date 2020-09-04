package com.lebnutrition.lebnutrition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class meal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	int id;
	
	int maindish;
	
	int sidedish1 = -1;
	
	int sidedish2 = -1;
	
	int sidedish3 = -1;
	
	int sidedish4 = -1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaindish() {
		return maindish;
	}

	public void setMaindish(int maindish) {
		this.maindish = maindish;
	}

	public int getSidedish1() {
		return sidedish1;
	}

	public void setSidedish1(int sidedish1) {
		this.sidedish1 = sidedish1;
	}

	public int getSidedish2() {
		return sidedish2;
	}

	public void setSidedish2(int sidedish2) {
		this.sidedish2 = sidedish2;
	}

	public int getSidedish3() {
		return sidedish3;
	}

	public void setSidedish3(int sidedish3) {
		this.sidedish3 = sidedish3;
	}

	public int getSidedish4() {
		return sidedish4;
	}

	public void setSidedish4(int sidedish4) {
		this.sidedish4 = sidedish4;
	}
	
	
	
}
