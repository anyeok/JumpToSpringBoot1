package com.sld.sdd2;

import com.sld.sdd2.answer.AnswerRepository;
import com.sld.sdd2.question.Question;
import com.sld.sdd2.question.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;


@SpringBootTest
class Basic1ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Transactional
    @Test
    void testJpa() {
        Question q1 = new Question();
        q1.setSubject("테스트");
        q1.setContent("테스트입니다");
        q1.setCreateDate(LocalDateTime.now());
    }
}

