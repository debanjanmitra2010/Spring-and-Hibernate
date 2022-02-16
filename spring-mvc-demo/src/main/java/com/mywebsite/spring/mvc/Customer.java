package com.mywebsite.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mywebsite.spring.mvc.validation.CourseCode;

public class Customer {

	public String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	public String lastName;

	@NotNull(message = "is required")
	@Min(value = 0, message = "must be greated than or equal to zero")
	@Max(value = 10, message = "must be less than or equal to 10")
	public Integer freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{6}")
	private String postalCode;

	@CourseCode(value="CIS", message="Course Code should start with CIS")
	private String courseCode;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
