package com.spring.jdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.api.Student;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.service.StudentDaoHelper;

public class Test {

	public static void main(String[] args) {

		// create object of Student class

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Application context loaded!!");
		
		StudentDaoHelper daoHelper=context.getBean("studentDaoHelper", StudentDaoHelper.class);
		daoHelper.setUpStudentTable();

		//StudentDaoImpl studentDaoImpl = context.getBean("studentDao", StudentDaoImpl.class);

		//Student student = new Student();
		//studentDaoImpl.deleteNoOfRecord(10);
		//studentDaoImpl.cleanUp();

		/*
		 * student.setRoll_No(12); student.setName("Roshan");
		 * student.setAddress("Kabul-kunduz");
		 * 
		 * studentDaoImpl.insert(student);
		 */

	}

}
