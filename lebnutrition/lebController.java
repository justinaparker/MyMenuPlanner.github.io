package com.lebnutrition.lebnutrition;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class lebController extends lebService{
	
	@GetMapping("/cart/all")
	Iterable<cart> listCartItems(){
		return this.listCart();
	}
	
	@GetMapping("/ingredients/all")
	Iterable<ingredients> listIngredient(){
		return this.listIngredients();
	} 
	
	@GetMapping("/meals/all")
	Iterable<meal> listMeal(){
		return this.listMeals();
	}
	
	@GetMapping("/recepies/all")
	Iterable<recepie> listRecepie(){
		return this.listRecepies();
	}
	
	@GetMapping("/recepielist/all")
	Iterable<recepielist> listRecepieList(){
		return this.listRecepieLists();
	}
	
	// Getting a Recepie by RecepieID
	@GetMapping("/recepie/recepieID/{rID}")
	recepie getRecepieWithID(@PathVariable int rID){
		return this.getRecepieByID(rID);
	}
	
	// Getting a RecepieList by RecepieID
	@GetMapping("/recepielist/recepieID/{rID}")
	Iterable<recepielist> getRecepieListWithID(@PathVariable int rID){
		return this.getRecepieListByID(rID);
	}
	
	// Getting Ingredients by RecepieID
	@GetMapping("/ingredients/recepieID/{rID}")
	Iterable<ingredients> getIngredientsWithID(@PathVariable int rID){
		return this.getIngredientsByID(rID);
	}	
	
	// Getting a Meal by MealID
	@GetMapping("/meal/mealID/{mid}")
	meal getMealWithID(@PathVariable int mid){
		return this.getMealByID(mid);
	}
	
	// Getting Main Recepie by MealID
	@GetMapping("main/recepie/mealID/{mid}")
	recepie getMainRecepieWithMealID(@PathVariable int mid){
		return this.getMainRecepieByMealID(mid);
	}
	
	// Getting Main Recepie List by MealID
	@GetMapping("main/recepielist/mealID/{mid}")
	Iterable<recepielist> getRecepieListWithMealID(@PathVariable int mid){
		return this.getMainRLByMealID(mid);
	}
	
	// Getting Ingredients for Main by MealID
	@GetMapping("main/ingredients/mealID/{mid}")
	Iterable<ingredients> getMainIngWithMealID(@PathVariable int mid){
		return this.getMainIngByMealID(mid);
	}	

	// Getting Side1 Recepie List by MealID
	@GetMapping("side1/recepie/mealID/{mid}")
	recepie getSide1WithMealID(@PathVariable int mid){
		return this.getSide1Bymeal(mid);
	}

	// Getting Side2 Recepie List by MealID
	@GetMapping("side2/recepie/mealID/{mid}")
	recepie getSide2WithMealID(@PathVariable int mid){
		return this.getSide2Bymeal(mid);
	}	
	
	// Getting Side3 Recepie List by MealID	
	@GetMapping("side3/recepie/mealID/{mid}")
	recepie getSide3WithMealID(@PathVariable int mid){
		return this.getSide3Bymeal(mid);
	}	
	
	// Getting Side4 Recepie List by MealID	
	@GetMapping("side4/recepie/mealID/{mid}")
	recepie getSide4WithMealID(@PathVariable int mid){
		return this.getSide4Bymeal(mid);
	}	
	
	// Getting Side1 Recepielist List by MealID
	@GetMapping("side1/recepielist/mealID/{mid}")
	Iterable<recepielist> getSide1RLWithMEAL(@PathVariable int mid){
		return this.getSide1RLbyMEAL(mid);
	}
	
	// Getting Side2 Recepielist List by MealID
	@GetMapping("side2/recepielist/mealID/{mid}")
	Iterable<recepielist> getSide2RLWithMEAL(@PathVariable int mid){
		return this.getSide2RLbyMEAL(mid);
	}	
	
	// Getting Side3 Recepielist List by MealID
	@GetMapping("side3/recepielist/mealID/{mid}")
	Iterable<recepielist> getSide3RLWithMEAL(@PathVariable int mid){
		return this.getSide3RLbyMEAL(mid);
	}
	
	// Getting Side4 Recepielist List by MealID
	@GetMapping("side4/recepielist/mealID/{mid}")
	Iterable<recepielist> getSide4RLWithMEAL(@PathVariable int mid){
		return this.getSide4RLbyMEAL(mid);
	}
	
	// Getting Ingredients for Side1 by MealID
	@GetMapping("side1/ingredients/mealID/{mid}")
	Iterable<ingredients> getSide1IngWithMealID(@PathVariable int mid){
		return this.getSide1IngByMealID(mid);
	}
	
	// Creating a Shopping List
	@GetMapping("/shoppinglist")
	Iterable<ingredients> getTheShoppingList(){
		return this.getShoppingList();
	}
	
	@PostMapping("/add/cart")
	cart addItem2Cart(String name, String type, int amt, int iid) {
		return this.addToCart(name, type, amt, iid);
	}
	
	@DeleteMapping("/delet/cart")
	public void deleteFromCart() {
		this.delete();	
	}
	
	@PostMapping("/add/ingredient")
	ingredients addToIngredient(@RequestParam String name, @RequestParam String type, @RequestParam String example) {
		return this.addIngredient(name, type, example);
	}	
	
	@DeleteMapping("/delete/ingredient/{id}")
	public void deleteAIngredient(@PathVariable int id) {
		this.deleteIngredient(id);	
	}
	
	@PostMapping("/add/recepietoshoppinglist")
	public void addRecepieToCart(@RequestParam int rid) {
		this.addReceToCart(rid);
	}
	
	
}	

