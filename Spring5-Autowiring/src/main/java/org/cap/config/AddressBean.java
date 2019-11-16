package org.cap.config;

import org.cap.pojo.Address;
import org.cap.pojo.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(value= {EmployeeBean.class})
public class AddressBean {

	@Bean(name="address2")
	public Address getAddressBean() {
		System.out.println("hello3ADD");
		Address address=new Address();
			address.setStreetName("West Avvenue");
			address.setCity("Bangaluru");
		return address;
	}
	
	@Bean(name="address")
	public Address getAddressBean1() {
		System.out.println("hello5ADD");

		Address address=new Address();
			address.setStreetName("North Avvenue");
			address.setCity("Chennai");
		return address;
	}
	
	@Bean(name="employee")
	@Scope(value="prototype")
	public Employee getEmployeeObj() {
		System.out.println("hello6EMP IN ADDRESSBEAN");
		Employee employee=new Employee();
		employee.setEmployeeId(1001);
		employee.setFirstName("Tom");
		employee.setLastName("Jack");
		employee.setSalary(34000);
		
		return employee;
	}
}
