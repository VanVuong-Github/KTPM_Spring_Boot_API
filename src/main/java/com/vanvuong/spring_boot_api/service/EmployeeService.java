package com.vanvuong.spring_boot_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vanvuong.spring_boot_api.entity.Employee;

@Service
public interface EmployeeService {
	public List<Employee> getAllEmployee();
	public void createEmployee(Employee employee);
	public Employee getEmployeeById(Long id);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Long id);
}
