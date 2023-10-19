package com.dilip.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilip.entity.Patient;
import com.dilip.repository.PatientRepository;
import org.springframework.beans.factory.annotation.*;
import com.dilip.repository.*;
import com.dilip.entity.Patient;
@Component
public class PatientOperations {

	@Autowired
	PatientRepository repository;
	
	    //select all player
	 
	  public List<Patient>getPatientDetails(){
		   return repository.getAllPatients();
	  }
	//by email id
	   public Patient getPatientDetailsEmailId(String email) {
		    return repository.getDetailsByEmail(email);
		    
	   }
	    //by age and gender
	   
	   public List<Patient>getPatientDetailsbyAgeAndGender(int age,String gender){
		   return repository.getPatientDetailsByAgeAndGender(age, gender);
	
	}
	  
	   
}
	
	
	
	
	
	