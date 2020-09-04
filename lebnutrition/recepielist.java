package com.lebnutrition.lebnutrition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class recepielist {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	int id;
	
	int recepieid;
	
	int ingredientid;
	
	String writtenamount;
	
	int standardamount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRecepieid() {
		return recepieid;
	}

	public void setRecepieid(int recepieid) {
		this.recepieid = recepieid;
	}

	public int getIngredientid() {
		return ingredientid;
	}

	public void setIngredientid(int ingredientid) {
		this.ingredientid = ingredientid;
	}

	public String getWrittenamount() {
		return writtenamount;
	}

	public void setWrittenamount(String writtenamount) {
		this.writtenamount = writtenamount;
	}

	public int getStandardamount() {
		return standardamount;
	}

	public void setStandardamount(int standardamount) {
		this.standardamount = standardamount;
	}
	
	
	
}
