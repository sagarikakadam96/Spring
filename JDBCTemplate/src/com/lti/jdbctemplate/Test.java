package com.lti.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		
		
		/*
		 * int status = dao.saveEmployee(new Employee(104, "cassidy", 75000));
		 * System.out.println(status);
		 */
		 
		 

		
		
		  int status=dao.updateEmployee(new Employee(101,"Riddhima",19000));
		  System.out.println(status);
		 
		 

		
		
		/*
		 * Employee e=new Employee(); e.setId(103); int status=dao.deleteEmployee(e);
		 * System.out.println(status);
		 */
		 

	}

}