package br.com.bfrjunior.museum_chatbot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bfrjunior.museum_chatbot.dto.MessageRequest;
import br.com.bfrjunior.museum_chatbot.utils.FaqAnswers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/chat")
public class FaqController {

    @PostMapping
    public ResponseEntity<String> answerQuestion(@RequestBody MessageRequest request) {

        FaqAnswers faqAnswers = new FaqAnswers();
        System.out.println(faqAnswers.getAnswers().get(0).getAnswer());
        return ResponseEntity.ok("oi deu certo");
    }

}
