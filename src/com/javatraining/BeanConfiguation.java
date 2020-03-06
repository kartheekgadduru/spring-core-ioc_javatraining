package com.javatraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguation {

	@Bean
	@Scope("prototype")
	public Student getStudent() {
		return new Student();
	}

	@Bean
	public ClassRoom getClassRoom() {
		return new ClassRoom();
	}


}
