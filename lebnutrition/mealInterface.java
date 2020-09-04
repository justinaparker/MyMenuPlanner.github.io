package com.lebnutrition.lebnutrition;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface mealInterface extends CrudRepository <meal, Integer>{

	@Query(value="select * from meal where id = :mid", nativeQuery=true)
	meal getMealByID(@Param(value = "mid") int mid);	
	
}
