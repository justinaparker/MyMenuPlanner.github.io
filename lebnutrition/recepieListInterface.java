package com.lebnutrition.lebnutrition;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface recepieListInterface extends CrudRepository <recepielist, Integer>{
	
	@Query(value="select * from recepielist where recepieid = :rid", nativeQuery=true)
	Iterable<recepielist> getRecepieListByRecepieID(@Param(value = "rid") int rid);
	
	@Query(value="select * from recepielist where recepieid  = (select maindish from meal where id = :mid )", nativeQuery=true)
	Iterable<recepielist> getMainRLByMealID(@Param(value = "mid") int mid);	
	
	@Query(value="select * from recepielist where recepieid  = (select sidedish1 from meal where id = :mid )", nativeQuery=true)
	Iterable<recepielist> getSide1RLbyMEAL(@Param(value = "mid") int mid);	
	
	@Query(value="select * from recepielist where recepieid  = (select sidedish2 from meal where id = :mid )", nativeQuery=true)
	Iterable<recepielist> getSide2RLbyMEAL(@Param(value = "mid") int mid);	
	
	@Query(value="select * from recepielist where recepieid  = (select sidedish3 from meal where id = :mid )", nativeQuery=true)
	Iterable<recepielist> getSide3RLbyMEAL(@Param(value = "mid") int mid);
	
	@Query(value="select * from recepielist where recepieid  = (select sidedish4 from meal where id = :mid )", nativeQuery=true)
	Iterable<recepielist> getSide4RLbyMEAL(@Param(value = "mid") int mid);	
	
}
