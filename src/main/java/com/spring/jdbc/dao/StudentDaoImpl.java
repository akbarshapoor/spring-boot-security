package com.spring.jdbc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.api.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student)
	{
		
		String sql="INSERT INTO STUDENT VALUES(?,?,?)";
		
		Object obj[]={student.getRoll_No(),student.getName(),student.getAddress()};
		
		int i=jdbcTemplate.update(sql, obj);
		System.out.println("No of rows has been inserted"+i);
		
		
		

	}
@Override
	public boolean deleteNoOfRecord(int rol_no) {
		String sql="DELETE FROM STUDENT WHERE Roll_No=?";
		int rollNoDeleted=jdbcTemplate.update(sql, rol_no);
		System.out.println("No of Record deleted"+rollNoDeleted);
		return rollNoDeleted==1;
	}

@Override
public void cleanUp() {
	String sql="TRUNCATE TABLE STUDENT";
	jdbcTemplate.execute(sql);
	System.out.println("Table cleaned up!!");

	
	
}

@Override
public void insertBatch(List<Student> students) {
	
	ArrayList<Object[]> sqlBatch=new ArrayList<>();
	String sql="INSERT INTO STUDENT VALUES(?,?,?)";
	
	for(Student tempStudent:students)
	{
		
		Object studentData[]= {tempStudent.getRoll_No(),tempStudent.getName(),tempStudent.getAddress()};
		sqlBatch.add(studentData);
		
	}
	
	jdbcTemplate.batchUpdate(sql, sqlBatch);
	
	System.out.println("Batch Updated completed!!");
	
}
	
	

}
