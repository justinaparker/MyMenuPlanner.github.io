package com.lebnutrition.lebnutrition;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface cartInterface extends CrudRepository<cart, Integer>{

	
	@Transactional
	@Query(value="set nocount on insert into cart select name, type, standardamount, ingredients.id from recepielist join ingredients on ingredients.id = recepielist.ingredientid where recepielist.recepieid = :rid select 1", nativeQuery=true) 
	void insertRecepie(@Param("rid") int rid);

}
