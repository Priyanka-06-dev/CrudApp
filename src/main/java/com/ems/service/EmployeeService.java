package com.ems.service;

import com.ems.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Employee empemployee);

    void deleteEmployeeById(Long id);
}
