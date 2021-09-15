package com.vanvuong.spring_boot_api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanvuong.spring_boot_api.entity.Employee;
import com.vanvuong.spring_boot_api.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	@Transactional
	public void createEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	@Transactional
	public Employee getEmployeeById(Long id) {
		return employeeRepo.getById(id);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
	}

}
