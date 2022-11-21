package br.univille.projetoquiz.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetoquiz.entity.Perguntas;
import br.univille.projetoquiz.service.PerguntasService;

@Controller
@RequestMapping("/pergunta")
public class PerguntasController {
    @Autowired
    private PerguntasService service;
    @GetMapping
    public ModelAndView index() {
        var listaPerguntas = service.getAll();
        return new ModelAndView("pergunta/index", "listaPerguntas", listaPerguntas
                );
    }
    @GetMapping("/novo")
    public ModelAndView novo() {
        var novasPerguntas = new Perguntas();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("perguntas", novasPerguntas);
        dados.put("novaPergunta", new Perguntas());
        return new ModelAndView("pergunta/form", dados);
    }
}
