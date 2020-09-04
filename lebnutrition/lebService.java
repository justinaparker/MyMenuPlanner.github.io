package com.lebnutrition.lebnutrition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class lebService {

	@Autowired
	customerUserInterface autoUser;
	
	@Autowired
	ingredientsInterface autoIngredients;
	
	@Autowired
	mealInterface autoMeal;
	
	@Autowired
	recepieInterface autoRecepie;
	
	@Autowired
	recepieListInterface autoRecepieList;
	
	@Autowired
	cartInterface autoCart;
	
	// Getting all Ingredients, Meals, Lists, and Recepies
	
	Iterable<ingredients> listIngredients(){
		return autoIngredients.findAll();
	}
	
	Iterable<meal> listMeals(){
		return autoMeal.findAll();
	}	

	Iterable<recepie> listRecepies(){
		return autoRecepie.findAll();
	}
	
	Iterable<recepielist> listRecepieLists(){
		return autoRecepieList.findAll();
	}	
	
	// Getting a Recepie by RecepieID
	recepie getRecepieByID(int rID){
		return autoRecepie.getRecepieByRecepieID(rID);
	}
	
	// Getting a RecepieList by RecepieID
	Iterable<recepielist> getRecepieListByID(int rID){
		return autoRecepieList.getRecepieListByRecepieID(rID);
	} 
	
	// Getting Ingredients by RecepieID
	Iterable<ingredients> getIngredientsByID(int rID){
		return autoIngredients.getIngredientsByRecepieID(rID);
	} 	
	
	// Getting a Meal by MealID
	meal getMealByID(int mid){
		return autoMeal.getMealByID(mid);
	}
	
	// Getting a Main Recepie by MealID
	recepie getMainRecepieByMealID(int mid){
		return autoRecepie.getMainRecepieByMealID(mid);
	}	
	
	// Getting a Main Recepie List by MealID
	Iterable<recepielist> getMainRLByMealID(int mid){
		return autoRecepieList.getMainRLByMealID(mid);
	}
	
	// Getting Main Ingredients by MealID
	Iterable<ingredients> getMainIngByMealID(int mid){
		return autoIngredients.getMainIngByMealID(mid);
	}	
	
	// Getting side1 Recepie by MealID
	recepie getSide1Bymeal(int mid){
		return autoRecepie.getSide1Bymeal(mid);
	}
	
	// Getting side2 Recepie by MealID
	recepie getSide2Bymeal(int mid){
		return autoRecepie.getSide2Bymeal(mid);
	}
	
	// Getting side3 Recepie by MealID
	recepie getSide3Bymeal(int mid){
		return autoRecepie.getSide3Bymeal(mid);
	}	
	
	// Getting side4 Recepie by MealID
	recepie getSide4Bymeal(int mid){
		return autoRecepie.getSide4Bymeal(mid);
	}	
		
	// Getting a Side1 Recepie List by MealID
	Iterable<recepielist> getSide1RLbyMEAL(int mid){
		return autoRecepieList.getSide1RLbyMEAL(mid);
	}
	
	// Getting a Side2 Recepie List by MealID
	Iterable<recepielist> getSide2RLbyMEAL(int mid){
		return autoRecepieList.getSide2RLbyMEAL(mid);
	}	
	
	// Getting a Side3 Recepie List by MealID
	Iterable<recepielist> getSide3RLbyMEAL(int mid){
		return autoRecepieList.getSide3RLbyMEAL(mid);
	}	
	
	// Getting a Side4 Recepie List by MealID
	Iterable<recepielist> getSide4RLbyMEAL(int mid){
		return autoRecepieList.getSide4RLbyMEAL(mid);
	}
	
	// Getting Side1 Ingredients by MealID
	Iterable<ingredients> getSide1IngByMealID(int mid){
		return autoIngredients.getSide1IngByMealID(mid);
	}
	
	// Creating a Shopping List
	Iterable<ingredients> getShoppingList(){
		return autoIngredients.getShoppingList();
	}
	
	// List items in the Cart
	Iterable<cart> listCart(){
		return autoCart.findAll();
	}
	
	// Adding Items to the cart
	cart addToCart(String name, String type, int amt, int iid){
		
		cart newItem = new cart();
		
		newItem.setName(name);
		newItem.setType(type);
		newItem.setAmt(amt);
		newItem.setIid(iid);
		
		return autoCart.save(newItem);
		
	}
	
	void delete(){
		autoCart.deleteAll();
	}
	
	// Adding Ingredients
	ingredients addIngredient(String name, String type, String example){
		
		ingredients newItem = new ingredients();
		
		newItem.setName(name);
		newItem.setType(type);
		newItem.setExample(example);

		return autoIngredients.save(newItem);
		
	}		
	
	void deleteIngredient(int id){
		autoIngredients.deleteById(id);
	}
	
	void addReceToCart(int rid) {
		autoCart.insertRecepie(rid);
	}
	
}
