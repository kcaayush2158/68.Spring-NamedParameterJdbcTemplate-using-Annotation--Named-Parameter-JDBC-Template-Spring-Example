package com.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.EmployeeDao;
import com.application.model.Employee;
import com.application.service.EmployeeService;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;


	@Override
	public void addEmployee(Employee employee) {
		employeeDao.createEmployee(employee);
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		return employeeDao.getEmployeeById(employeeId);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		employeeDao.deleteEmployeeById(employeeId);

	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		employeeDao.updateEmployeeEmailById(newEmail, employeeId);

	}

	@Override
	public List<Employee> getAllEmployeesInfo() {
		return employeeDao.getAllEmployeesDetails();
	}

}
