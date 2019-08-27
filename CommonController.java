package com.philips.chatbot.controller;


import com.philips.chatbot.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class CommonController {

    @Autowired
    private OptionRepository optionRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public Optional<Questions> findbyQuesID(@PathVariable int id) {
        return questionRepository.findById(id);
    }

/*
    public boolean validate(int oid){

    }*//*


    @GetMapping("/test/{qid}/{oid}")
    public ModelAndView askQuestions(@PathVariable int qid, @PathVariable int oid) {
        Map<String, Object> modelData = new HashMap<>();
        Optional<Questions> ques = questionRepository.findById(qid);
        modelData.put("products", ques);
        if(validate(oid)) {
            Optional<Options> option = optionRepository.findById(oid);
            modelData.put("products", option);
        }

        return new ModelAndView("/productlist.jsp", modelData);

    }*/
}
