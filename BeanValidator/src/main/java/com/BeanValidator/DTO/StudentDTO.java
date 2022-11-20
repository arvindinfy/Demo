package com.BeanValidator.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "buildDTO")
@Getter
@Setter
public class StudentDTO {

    @Size(min = 2,max = 8)
    @NotEmpty
    private String name;

    @NotNull
    private String location;

    @Min(18)
    @Max(40)
    private Integer age;

    
    private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", location=" + location + ", age=" + age + ", email=" + email + "]";
	}
    
    


}
