package com.tcs.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.demo.model.Employee;

@RestController
public class EmployeeController {
ArrayList<Employee> Emp=new ArrayList<>();
//Emp.add(new Employee("Raj",5,"Kolkata"));
public EmployeeController() {
	Emp.add(new Employee("Raj",5,"Kolkata"));
	Emp.add(new Employee("Sayantan", 10, "Bangalore"));
	Emp.add(new Employee("Sayonnil", 8, "Naihati"));
	Emp.add(new Employee("Souhardya",12,"Purulia"));
}
@GetMapping("/getEmployeeById/{eid}")
public Employee getEmployees(@PathVariable(name="eid") int id) {
for(Employee e:Emp)
{
	if(e.getId()==id)
	{
		return e;
	}
}
return null;

}
@GetMapping("/getAllEmployees")
public ArrayList<Employee> getAllEmployees(){
	return Emp;
}

}
