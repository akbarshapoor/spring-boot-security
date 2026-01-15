package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.api.Student;

public interface StudentDao {
	
	void insert(Student student);
	void insertBatch(List<Student> students);
	
	
	boolean deleteNoOfRecord(int rol_no);
	
	void cleanUp();

}
