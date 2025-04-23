package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee saveEmployee(Employee employee) {

		System.out.println("Service " + employee);
		return repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	@Override 
	public void deleteEmployeeById(Long id) {
		repository.deleteById(id);
		
	}

}
