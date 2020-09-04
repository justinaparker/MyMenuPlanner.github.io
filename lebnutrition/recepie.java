package com.lebnutrition.lebnutrition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class recepie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	int id;
	
	String name;
	
	String imgname;
	
	String description;
	
	int servings;
	
	int cooktime;
	
	String cookinginstructions;
	
	boolean favorite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCooktime() {
		return cooktime;
	}

	public void setCooktime(int cooktime) {
		this.cooktime = cooktime;
	}

	public String getCookinginstructions() {
		return cookinginstructions;
	}

	public void setCookinginstructions(String cookinginstructions) {
		this.cookinginstructions = cookinginstructions;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	
	
	
}
