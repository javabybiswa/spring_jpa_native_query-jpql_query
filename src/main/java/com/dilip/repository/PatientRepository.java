package com.dilip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.dilip.entity.Patient;

import jakarta.transaction.Transactional;

@Component
public interface PatientRepository extends CrudRepository<Patient, String>{

	
	//get all players
	@Query(value="select * from player_Info",nativeQuery=true)
	   public List<Patient>getAllPatients();
	
	//get all Player_Info with EmailId
	
	@Query(value="select * from player_info where emailid=?1",nativeQuery=true)
	   public Patient getDetailsByEmail(String email);
	
	//get All Patients with Age and Gender
	  
	 @Query(value="select * from player_info where age=?1 and gender=?2",nativeQuery=true)
	    public List<Patient>getPatientDetailsByAgeAndGender(int age,String gender);
	 		
	
}