package com.micro.quiz_service.repositories;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.JsonObject;

@FeignClient(name = "question-service")
public interface QuestionServiceClient {

    @GetMapping("/getQuestions")
    String getQuestions(@RequestParam("category") String category);
}
