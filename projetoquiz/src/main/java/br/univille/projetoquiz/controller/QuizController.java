package br.univille.projetoquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetoquiz.service.QuizService;

@Controller
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService service;

    @GetMapping
    public ModelAndView index() {
        var listaQuiz = service.getAll();
        return new ModelAndView("quiz/index", "listaQuiz", listaQuiz);
    }
}
