//	Inversion of control

package com.example.demo;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        
        Employee e=(Employee)factory.getBean("obj");  
        e.display();  
        Employee e1=(Employee)factory.getBean("obj1");  
        e1.display();
        Employee e2=(Employee)factory.getBean("obj2");  
        e2.display();
    }  
}  