package com.lebnutrition.lebnutrition;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface recepieInterface extends CrudRepository <recepie, Integer>{
	
	@Query(value="select * from recepie where id = :rid", nativeQuery=true)
	recepie getRecepieByRecepieID(@Param(value = "rid") int rid);
	
	@Query(value="select * from recepie where id = (select maindish from meal where id = :mid )", nativeQuery=true)
	recepie getMainRecepieByMealID(@Param(value = "mid") int mid);
	
	@Query(value="select * from recepie where id = (select sidedish1 from meal where id = :mid )", nativeQuery=true)
	recepie getSide1Bymeal(@Param(value = "mid") int mid);
	
	@Query(value="select * from recepie where id = (select sidedish2 from meal where id = :mid )", nativeQuery=true)
	recepie getSide2Bymeal(@Param(value = "mid") int mid);
	
	@Query(value="select * from recepie where id = (select sidedish3 from meal where id = :mid )", nativeQuery=true)
	recepie getSide3Bymeal(@Param(value = "mid") int mid);
	
	@Query(value="select * from recepie where id = (select sidedish4 from meal where id = :mid )", nativeQuery=true)
	recepie getSide4Bymeal(@Param(value = "mid") int mid);	
	
}
