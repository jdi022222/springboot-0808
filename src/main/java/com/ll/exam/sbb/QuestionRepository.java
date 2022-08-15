package com.ll.exam.sbb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);

    Question findBySubjectAndContent(String s, String s1);

    List<Question> findBySubjectLike(String s);

    @Transactional
    @Modifying
    @Query(value = "truncate question", nativeQuery = true)
    void truncate();
}