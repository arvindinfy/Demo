package com.BeanValidator.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeanValidator.DTO.StudentDTO;
import com.BeanValidator.Entity.Student;
import com.BeanValidator.Service.StudentService;
import com.BeanValidator.exception.StudentnofoundException;

@RestController
@RequestMapping(value = "/College")
public class HomeController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/Students")
	public ResponseEntity<List<Student>> getallstudents() throws StudentnofoundException {
		List<Student> listofstudents = studentService.findallstudent();
		System.out.println("listofstudents is---> " + listofstudents);

		if (!listofstudents.isEmpty()) {
			return ResponseEntity.ok(listofstudents);
		} else {
			throw new StudentnofoundException("Student is not present");
		}

	}

	@PostMapping("/Student")
	public ResponseEntity<Student> savestudent(@RequestBody StudentDTO studentDTO) {
		System.out.println("----------------->" +studentDTO);
		Student student = studentService.savestudent(studentDTO);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(student);

	}

	@GetMapping("/Students/{id}")
	public ResponseEntity<List<Student>> getallstudentsbyId(@PathVariable("id") Integer id) {
		List<Student> listofstudents = studentService.findallstudentById(id);
		System.out.println("listofstudents from given id is---> " + listofstudents);
		return ResponseEntity.ok(listofstudents);

	}

}
