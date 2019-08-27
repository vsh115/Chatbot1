package com.philips.chatbot.controller;

import com.philips.chatbot.model.Options;
import com.philips.chatbot.model.Product;
import com.philips.chatbot.model.QuestionRepository;
import com.philips.chatbot.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController {



    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/test/questions")
    public List<Questions> getAllProducts() {
        return questionRepository.findAll();
    }

    @GetMapping("/test/questions/{id}")
    public Questions findbyID(@PathVariable int id) {
        return questionRepository.getOne(id);
    }


    @GetMapping("/questions/{id}")
    public List<Options> getQuestionOptions(@PathVariable int id) {

        Optional<Questions> question = questionRepository.findById(id);
        return question.get().getOptions();
    }

}
