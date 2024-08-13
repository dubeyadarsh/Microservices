package com.micro.question_service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.micro.question_service.models.QuestionModel;
import com.micro.question_service.services.QuestionService;

@RestController
public class QuestionsController {
	@Autowired QuestionService qs;
	
	@PostMapping("/addQuestion")
	public ResponseEntity<String> addQuestions(@RequestBody List<QuestionModel> qm){
		String res=qs.addQuestions(qm);
		return ResponseEntity.ok(res);
	}
	@GetMapping("/getQuestions")
	public ResponseEntity<List<QuestionModel>> addQuestions(@RequestParam String category){
		List<QuestionModel> resList=qs.getQuestions(category);
		return ResponseEntity.ok(resList);
	}
}
