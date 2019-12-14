package com.example.demo.objects;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	private String age;
	private String location;

	
	public Person() {
		super();
	}
	
	public Person(String name, String age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
