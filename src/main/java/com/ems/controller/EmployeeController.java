package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

@RestController
@RequestMapping("/employees") // http://localhost:8081/employees/msg

public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/Msg")
	public String wish() {
		return "Hi good morning all!";
	}

	@PostMapping("/hello") // c-create
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee createEmp= service.saveEmployee(employee);
		return createEmp;
	}

	@GetMapping("/all")
	public List<Employee> getAllEmployee() {
		List<Employee> getAll= service.getAllEmployees();
		return getAll;
	}

	@GetMapping("/{id}") // http://localhost:8083/employees/
	public Employee getEmployeeById(@PathVariable Long id) {
		Employee getEmp= service.getEmployeeById(id);
		return getEmp;
	}

	@PutMapping("/upd/{id}")// update
	public Employee updateEmployee(@RequestBody Employee employee) { 
			Employee updateEmp= service.updateEmployee(employee);
			return updateEmp;

	}
	
	@DeleteMapping("/del/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		service.deleteEmployeeById(id);
		
	}

}
