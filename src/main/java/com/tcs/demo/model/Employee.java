package com.tcs.demo.model;

public class Employee {
	
	private String name;
	private int id;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee(String name, int id, String location) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
	}
	

}

