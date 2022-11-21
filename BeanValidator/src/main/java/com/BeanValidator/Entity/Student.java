package com.BeanValidator.Entity;

/*@Author Arvind*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Entity
@Table(name = "tbl_Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String location;

    private Integer age;

    private String email_Id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public Student(Integer id, String name, String location, Integer age, String email_Id) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.age = age;
		this.email_Id = email_Id;
	}

	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + ", age=" + age + ", email_Id="
				+ email_Id + "]";
	}
	
	
    
    


}
