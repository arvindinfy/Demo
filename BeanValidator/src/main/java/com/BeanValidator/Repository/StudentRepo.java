package com.BeanValidator.Repository;

import com.BeanValidator.Entity.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends JpaRepository<Student,Integer> {
	
	public List<Student> findAll();
	
	
	@Query(nativeQuery = true, value = "select * from tbl_students where name=:name and location=:location")
	public Student findbaseonnameandlocation(@Param("name")String name,@Param("location")String location);


	public List<Student> findAllById(Integer id);
	
	
}
