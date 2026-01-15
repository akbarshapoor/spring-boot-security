package com.spring.jdbc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.api.Student;
import com.spring.jdbc.dao.*;

@Service("studentDaoHelper")
public class StudentDaoHelper {
	
	
	@Autowired
	private StudentDao studentDaoImpl;
	
	public void setUpStudentTable()
	
	{
		//create object of Student class
		
		Student student1=new Student();
		
		student1.setRoll_No(1);
		student1.setName("Iman jan");
		student1.setAddress("Afghanistan");
		
		
		Student student2=new Student();
		student2.setRoll_No(2);
		student2.setName("Rohan jan");
		student2.setAddress("Kunduz");
		
		
		Student student3=new Student();
		student3.setRoll_No(3);
		student3.setName("Asman jan");
		student3.setAddress("Afghanistan-kunduz");
		
		ArrayList<Student> arrayList=new ArrayList<>();
		
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		
		studentDaoImpl.insertBatch(arrayList);
		
	}
	
	
	

}
