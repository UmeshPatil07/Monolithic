package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.Employee;
import com.infy.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepo;
	
	public Employee getEmployee(int id) {
		   return empRepo.findById(id).get();
			
			}
	
	public Employee getEmployeeById(int Id) {
		Employee e=empRepo.findById(Id).get();
		return e;
	}
	
	public Employee addEmployee(Employee e) {
	    empRepo.save(e);
	    return e;
	}

}
