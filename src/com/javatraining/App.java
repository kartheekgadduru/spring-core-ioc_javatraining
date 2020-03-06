package com.javatraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguation.class);//

		Student student = context.getBean(Student.class);
		Student student2 = context.getBean(Student.class);

		ClassRoom room = context.getBean(ClassRoom.class);
		room.checkHome();

		System.out.println(student);
		System.out.println(student2);
		System.out.println(room);
		/*BeanFactory factory = new XmlBeanFactory(new ClassPathResource("/com/javatraining/bean-config.xml") );// lazy loading
		Student student = (Student)factory.getBean("student");
		System.out.println(student);*/
		System.out.println(student == student2);
		System.out.println("student.hashCode() ->" + student.hashCode() +  " "+ "student2.hashCode() ->"+ student2.hashCode());

	}

}
