package br.univille.projetoquiz.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetoquiz.entity.Perguntas;
import br.univille.projetoquiz.entity.Quiz;
import br.univille.projetoquiz.service.PerguntasService;
import br.univille.projetoquiz.service.QuizService;

@Controller
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService service;
    @Autowired
    private PerguntasService perguntasService;

    @GetMapping
    public ModelAndView index() {
        var listaQuizes = service.getAll();
        return new ModelAndView("quiz/index",
                "listaQuizes", listaQuizes);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var novoQuiz = new Quiz();
        var listaPerguntas = perguntasService.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("quiz", novoQuiz);
        dados.put("listaPerguntas", listaPerguntas);
        dados.put("novaPergunta", new Perguntas());
        return new ModelAndView("quiz/form", dados);
    }
}
