package br.univille.projetoquiz.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
        dados.put("pergunta", novasPerguntas);
        dados.put("novaPergunta", new Perguntas());
        return new ModelAndView("pergunta/form", dados);
    }
    @PostMapping(params = "form")
    public ModelAndView save(Perguntas perguntas){
        service.save(perguntas);
        
        return new ModelAndView("redirect:/pergunta");
    }
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        
        var umaPergunta = service.findById(id);
        return new ModelAndView("pergunta/form",
                                "pergunta", umaPergunta);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){

        service.delete(id);

        return new ModelAndView("redirect:/pergunta");
    }
}
