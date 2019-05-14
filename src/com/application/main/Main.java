package com.application.main;

import java.util.List;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.application.model.Employee;
import com.application.service.EmployeeService;
import com.application.service.impl.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args) {
		
	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	 EmployeeService employeeService = context.getBean("employeeService",EmployeeServiceImpl.class);
		       
		/*
		 * Employee employee = new Employee();
		 * employee.setEmail("aayushkc2158@gmail.com");
		 * employee.setEmployeeName("aayush kc"); employee.setGender("male");
		 * employee.setSalary(2000.00); employeeService.addEmployee(employee);
		 */
		
		// employeeService.updateEmployeeEmailById("aayushkc2158@hotmail.com", 3); 
		 //employeeService.deleteEmployeeById(1);
	 List<Employee> employee = employeeService.getAllEmployeesInfo();
	 for(Employee employeeList:employee) {
		 System.out.println(employeeList.getEmployeeId()+"\t"+employeeList.getEmployeeName()+"\t"+employeeList.getEmail()+"\t"+employeeList.getSalary()+"\t"+employeeList.getGender());
	 }
	 context.close();
	 
	}
	
	

}
