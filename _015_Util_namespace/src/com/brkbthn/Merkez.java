package com.brkbthn;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Merkez {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("camelContext.xml");
		

		Personel koleksiyonlar = context.getBean("koleksiyonlar", Personel.class);
		
		System.out.println(koleksiyonlar);
		

}
}