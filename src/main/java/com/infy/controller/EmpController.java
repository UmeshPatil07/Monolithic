package com.infy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.infy.dto.Employee;
import com.infy.service.EmployeeService;

@RestController
@RequestMapping("/emp")

public class EmpController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable ("id")int id) {
	 Employee e =service.getEmployee(id);
		return e;
		
	}
	@PostMapping("/addemp")
	public Employee addEmployee(@RequestBody Employee e) {
	service.addEmployee(e);
	return e;
		
	}

}
