package br.com.bfrjunior.museum_chatbot.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FaqAnswer {
    private List<String> keywords;
    private String answer;
}
