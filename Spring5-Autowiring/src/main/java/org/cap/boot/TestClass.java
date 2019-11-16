package org.cap.boot;

import org.cap.config.AddressBean;
import org.cap.pojo.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		System.out.println("hello");
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AddressBean.class);
		
		System.out.println("hello2");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("hello7");

		Employee employee1 = (Employee) context.getBean("employee");
		System.out.println("hello8");

		employee.setLastName("Jackson");
		
		System.out.println(employee);
		System.out.println(employee1);

		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);

	}

}


/*
 * hello 17:11:40.479 [main] DEBUG
 * org.springframework.context.annotation.AnnotationConfigApplicationContext -
 * Refreshing
 * org.springframework.context.annotation.AnnotationConfigApplicationContext@
 * 58d25a40 17:11:40.496 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean
 * 'org.springframework.context.annotation.
 * internalConfigurationAnnotationProcessor' 17:11:40.576 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Overriding bean definition for bean 'employee' with a different definition:
 * replacing [Root bean: class [null]; scope=prototype; abstract=false;
 * lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true;
 * primary=false; factoryBeanName=org.cap.config.EmployeeBean;
 * factoryMethodName=getEmployeeObj; initMethodName=null;
 * destroyMethodName=(inferred); defined in org.cap.config.EmployeeBean] with
 * [Root bean: class [null]; scope=prototype; abstract=false; lazyInit=null;
 * autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false;
 * factoryBeanName=addressBean; factoryMethodName=getEmployeeObj;
 * initMethodName=null; destroyMethodName=(inferred); defined in
 * org.cap.config.AddressBean] 17:11:40.649 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean
 * 'org.springframework.context.event.internalEventListenerProcessor'
 * 17:11:40.651 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean
 * 'org.springframework.context.event.internalEventListenerFactory' 17:11:40.652
 * [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean
 * 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
 * 17:11:40.654 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean
 * 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
 * 17:11:40.662 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean 'addressBean' 17:11:40.668 [main]
 * DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean 'org.cap.config.EmployeeBean'
 * 17:11:40.669 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean 'emp' hello9EMP Employee Class -
 * no args 17:11:40.690 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean 'address' hello5ADD address
 * default constructor 17:11:40.697 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean 'address2' hello3ADD address
 * default constructor hello2 hello6EMP IN ADDRESSBEAN Employee Class - no args
 * hello7 hello6EMP IN ADDRESSBEAN Employee Class - no args hello8 Employee
 * [employeeId=1001, firstName=Tom, lastName=Jackson, salary=34000.0,
 * address=Address [streetName=North Avvenue, city=Chennai]] Employee
 * [employeeId=1001, firstName=Tom, lastName=Jack, salary=34000.0,
 * address=Address [streetName=North Avvenue, city=Chennai]] Employee
 * [employeeId=12345, firstName=Tim, lastName=paul, salary=4500.0,
 * address=Address [streetName=North Avvenue, city=Chennai]]
 */




