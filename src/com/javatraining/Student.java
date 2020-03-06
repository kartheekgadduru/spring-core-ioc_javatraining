package com.javatraining;

import org.springframework.beans.factory.annotation.Value;



public class Student {

	@Value("kartheek")
	private String name;
	@Value("abc@gmail.com")
	private String email;
	@Value("23")
	private int age;

	public Student() {
		System.out.println("do it with ");
	}
	public Student(String name, String email, int age) {
		System.out.println("3 argument constructor....");
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", age=" + age
				+ "]";
	}

	public void doHomeWork() {
		System.out.println("I have done home work");
	}


}
