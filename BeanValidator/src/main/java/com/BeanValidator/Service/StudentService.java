package com.BeanValidator.Service;


import com.BeanValidator.DTO.StudentDTO;
import com.BeanValidator.Entity.Student;
import com.BeanValidator.Repository.StudentRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

	public List<Student> findallstudent() {
		// TODO Auto-generated method stub
		List<Student> findAll = studentRepo.findAll();
		return findAll;
	}

	public Student savestudent(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		Student student= new Student();
		System.out.println("in service layer---->" +studentDTO);
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail_Id(studentDTO.getEmail());
		student.setLocation(studentDTO.getLocation());
		Student save = studentRepo.save(student);
		return save;
	}

	public List<Student> findallstudentById(Integer id) {
		// TODO Auto-generated method stub
		List<Student> findAllById = studentRepo.findAllById(id);
		return findAllById;
	}


}
