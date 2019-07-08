package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public List<Employee> getEmployee() {
		
		return (List<Employee>) employeeRepository.findAll();
	}
	
	public long save(Employee emp){
		Employee save = employeeRepository.save(emp);
		return save.getId();
	}

}
