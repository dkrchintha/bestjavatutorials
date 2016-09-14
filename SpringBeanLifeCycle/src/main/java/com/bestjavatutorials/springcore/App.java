package com.bestjavatutorials.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bestjavatutorials.springcore.beans.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			Student st = (Student) ctx.getBean("student");
			System.out.println(st.getName());
			ctx.registerShutdownHook();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ctx.close();
		}
		// System.out.println( "Hello World!" );
	}
}
