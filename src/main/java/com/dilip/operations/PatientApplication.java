package com.dilip.operations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dilip.entity.Patient;

public class PatientApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		    
		
		PatientOperations ops = context.getBean(PatientOperations.class);
		
	/*	Patient p = new Patient();
		p.setEmailId("Sachin@gmail.com");
		p.setName("Sachin Tendlukar");
		p.setContact("+918826111377");
		p.setAge(30);
		p.setGender("MALE");
		
		Patient p1 = new Patient();
		p1.setEmailId("sehwag@gmail.com");
		p1.setName("Virendra Sehwag");
		p1.setContact("+828388");
		p1.setAge(29);
		p1.setGender("MALE");
		
		Patient p2 = new Patient();
		p2.setEmailId("smruti@gmail.com");
		p2.setName("smruti mandhana");
		p2.setContact("+44343423");
		p2.setAge(36);
		p2.setGender("FEMALE");
		
		Patient p3 = new Patient();
		p3.setEmailId("mitali@gmail.com");
		p3.setName("MitaliRaj");
		p3.setContact("+64654651");
		p3.setAge(28);
		p3.setGender("FEMALE");
		
		Patient p4 = new Patient();
		p4.setEmailId("sefali@gmail.com");
		p4.setName("SefaliVerma");
		p4.setContact("+64654651");
		p4.setAge(25);
		p4.setGender("FEMALE");
		
		  
		
		Patient p5 = new Patient();
		p5.setEmailId("dhoni@gmail.com");
		p5.setName("Mahendra Singh Dhoni");
		p5.setContact("+64654651");
		p5.setAge(28);
		p5.setGender("MALE");
		
		List<Patient> allPatients = new ArrayList<>();
		allPatients.add(p);
		allPatients.add(p1);
		allPatients.add(p2);
		allPatients.add(p3);
		allPatients.add(p4);
		allPatients.add(p5);
		
		ops.addMorePatientDetails1(allPatients);*/
	
//	}
//}
	//all player	 
	List<Patient>allPatients=ops.getPatientDetails();
	  System.out.println(allPatients);
	  
	 //by email id
	  System.out.println("******with emailid*****");
	  Patient patient=ops.getPatientDetailsEmailId("sachin@gmail.com");
	  System.out.println(patient);
	  
	  //by age and gender
	  
	  System.out.println("*****patient with age and gender ******");
	  List<Patient> patients=ops.getPatientDetailsbyAgeAndGender(28, "FEMALE");
	  System.out.println(patients);
	}
}
		
		
		
		

	
		
		
		
		
		
		
	