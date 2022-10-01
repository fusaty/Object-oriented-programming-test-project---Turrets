package com.project.finalExam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.finalExam.components.Component;
import com.project.finalExam.components.PasovyPodvozok;
import com.project.finalExam.services.BasicService;
import com.project.finalExam.services.ComponentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalExamApplication {


	public static void main(String[] args) {


		SpringApplication.run(FinalExamApplication.class, args);
	}


}
