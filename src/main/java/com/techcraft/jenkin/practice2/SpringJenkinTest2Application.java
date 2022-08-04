package com.techcraft.jenkin.practice2;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinTest2Application {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinTest2Application.class);

	@PostConstruct
	public void init() {
		logger.info("Application is started...");

		/*
		 * or create a new repository on the command line echo "# Spring-JenkinTest" >>
		 * README.md git init git add README.md git commit -m "first commit" git branch
		 * -M main git remote add origin
		 * https://github.com/JavaTechCraft/Spring-JenkinTest.git git push -u origin
		 * main
		 * 
		 * …or push an existing repository from the command line
		 * 
		 * git remote add origin https://github.com/JavaTechCraft/Spring-JenkinTest.git
		 * git branch -M main git push -u origin main
		 */

	}
	

	public static void main(String[] args) {
		logger.info("Application is started to execute project with build pipeline from jenkin....");
		logger.info("Application is started to execute project....");
		SpringApplication.run(SpringJenkinTest2Application.class, args);
		logger.info("Application is stopped to execute project....");
	}

}
