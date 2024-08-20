package br.com.bfrjunior.museum_chatbot.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.bfrjunior.museum_chatbot.domain.FaqAnswer;
import br.com.bfrjunior.museum_chatbot.utils.FaqAnswers;

@Service
public class FaqService {

    final private FaqAnswers faqAnswers = new FaqAnswers();

    public String getAnswer(String question) {
        String[] words = question.toLowerCase().split("\\s+");
        List wordsList = Arrays.asList(words).stream().map(String::toLowerCase).toList();

        for (FaqAnswer entry : faqAnswers.getAnswers()) {
            for (String keyword : entry.getKeywords()) {
                if (wordsList.contains(keyword.toLowerCase())) {
                    return entry.getAnswer();
                }
            }
        }

        return faqAnswers.getDefaultAnswer();
    }
}
