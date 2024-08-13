package com.micro.quiz_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.quiz_service.models.QuizModel;

@Repository
public interface QuizRepository extends JpaRepository<QuizModel,Integer> {

}
