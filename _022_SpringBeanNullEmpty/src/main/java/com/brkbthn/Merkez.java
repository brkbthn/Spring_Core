package com.brkbthn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("cnf.xml");
		
		Personel personel = context.getBean("personel", Personel.class);
		System.out.println(personel);
		
		
}
}