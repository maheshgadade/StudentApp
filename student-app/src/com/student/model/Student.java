package com.student.model;

public class Student {
	private String firstName;
	private String lastName;
	private String cityName;
	private String email;
	
	private long id;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	System.out.println("cheking some changes or not in my eclips repository");
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", cityName=" + cityName + ", email="
				+ email + ", id=" + id + "]";
	}
	
	}


