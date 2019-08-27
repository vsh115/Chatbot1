package com.philips.chatbot.controller;

import com.philips.chatbot.model.OptionRepository;
import com.philips.chatbot.model.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class OptionController {

        @Autowired
    private OptionRepository optionRepository;



    @GetMapping("/test/options")
    public List<Options> getAllOptions() {
        return optionRepository.findAll();
    }

/*   @GetMapping("/test/options/{id}")
    public  Optional<String> findbyID(@PathVariable int id) {



    }*/

}
