package org.cap.config;

import org.cap.pojo.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeBean {


	@Bean(name="employee")
	@Scope(value="prototype")
	public Employee getEmployeeObj() {
		System.out.println("hello4EMP");
		Employee employee=new Employee();
		employee.setEmployeeId(1001);
		employee.setFirstName("Tom");
		employee.setLastName("Jack");
		employee.setSalary(34000);
		
		return employee;
	}
	@Bean(name="emp")
	public Employee getEmployeeBean() {
		System.out.println("hello9EMP");

		Employee employee=new Employee();
		employee.setEmployeeId(12345);
		employee.setFirstName("Tim");
		employee.setLastName("paul");
		employee.setSalary(4500);
		return employee;
	}
}
