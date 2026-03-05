package com.SpringwithDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new  ClassPathXmlApplicationContext("config.xml");
    	
    	
    	Person person=context.getBean("person",Person.class);
    	person.emi();
    	
    	//Employee empbean = context.getBean("emp",Employee.class);
    	//empbean.display();
    	
    	//System.out.println(empbean);
        //System.out.println("Hello World!");
    }
}
