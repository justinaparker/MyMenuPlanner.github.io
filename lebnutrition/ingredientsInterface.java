package com.lebnutrition.lebnutrition;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ingredientsInterface extends CrudRepository<ingredients, Integer> {
	
	@Query(value="select * from ingredients where id in (select ingredientid from recepielist where recepieid = :rid)", nativeQuery=true)
	Iterable<ingredients> getIngredientsByRecepieID(@Param(value = "rid") int rid);	
	
	@Query(value="select * from ingredients where id in (select ingredientid from recepielist where recepieid = ( select maindish from meal where id = :mid ))", nativeQuery=true)
	Iterable<ingredients> getMainIngByMealID(@Param(value = "mid") int mid);
	
	@Query(value="select * from ingredients where id in (select ingredientid from recepielist where recepieid = ( select sidedish1 from meal where id = :mid ))", nativeQuery=true)
	Iterable<ingredients> getSide1IngByMealID(@Param(value = "mid") int mid);
	
	@Query(value="select * from ingredients where id in (select ingredientid from recepielist where recepieid = ( select sidedish2 from meal where id = :mid ))", nativeQuery=true)
	Iterable<ingredients> getSide2IngByMealID(@Param(value = "mid") int mid);
	
	@Query(value="select * from ingredients where id in (select ingredientid from recepielist where recepieid = ( select sidedish3 from meal where id = :mid ))", nativeQuery=true)
	Iterable<ingredients> getSide3IngByMealID(@Param(value = "mid") int mid);	
	
	@Query(value="select * from ingredients where id in (select ingredientid from recepielist where recepieid = ( select sidedish4 from meal where id = :mid ))", nativeQuery=true)
	Iterable<ingredients> getSide4IngByMealID(@Param(value = "mid") int mid);
	
	@Query(value="select top 0 * from ingredients union select (iid) as ID , [name], [type], convert(nvarchar, sum(amt)) as Total from cart group by (iid) , [name], [type] order by type", nativeQuery=true)
	Iterable<ingredients> getShoppingList();	
	
	
	
}
