package com.micro.quiz_service.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.micro.quiz_service.repositories.QuestionServiceClient;



@RestController
public class QuizController {

	@Autowired QuestionServiceClient qsc;
	@GetMapping("/generateQuiz")
	public ResponseEntity<String> addQuestions(@RequestParam String category){
		System.out.println("Accessing ***");
		String res=qsc.getQuestions(category);
		System.out.println("Further Accessing ***" + res);
		return  ResponseEntity.ok(res);
	}
}
