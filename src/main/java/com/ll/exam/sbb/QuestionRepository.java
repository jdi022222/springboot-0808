package com.ll.exam.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);

    Question findBySubjtAndContenect(String s, String s1);
}