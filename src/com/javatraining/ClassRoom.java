package com.javatraining;

import org.springframework.beans.factory.annotation.Autowired;


public class ClassRoom {

	@Autowired
	private Student student;

	public ClassRoom() {
		System.out.println(" class Room constructor is been called....");
	}

	public void checkHome() {

		student.doHomeWork();
	}
	@Override
	public String toString() {
		return " no one in the class room";
	}






}
