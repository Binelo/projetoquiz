package br.univille.projetoquiz.controller;

import java.util.HashMap;
// import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        var listaPerguntas = perguntasService.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("listaQuizes", listaQuizes);
        dados.put("listaPerguntas", listaPerguntas);
        return new ModelAndView("quiz/index", dados);
    }
    @PostMapping(params = "save")
    public ModelAndView save(Quiz quiz,
            BindingResult bindingResult) {
        service.save(quiz);
        return new ModelAndView("redirect:/quiz");
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
    @PostMapping(params = "incperg")
    public ModelAndView incluirPergunta(Quiz quiz,
            Perguntas novaPergunta) {        
        quiz.getListaPerguntas().add(novaPergunta);

        var listaPerguntas = perguntasService.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("quiz", quiz);
        dados.put("listaPerguntas", listaPerguntas);
        dados.put("novaPergunta", new Perguntas());
        return new ModelAndView("quiz/form", dados);
}
@GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        
        var umQuiz = service.findById(id);
        var listaPerguntas = perguntasService.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("quiz", umQuiz);
        dados.put("listaPerguntas", listaPerguntas);
        dados.put("novaPergunta", new Perguntas());
        return new ModelAndView("quiz/form", dados);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){

        service.delete(id);

        return new ModelAndView("redirect:/quiz");
    }
    @PostMapping(params = "removepergunta")
    public ModelAndView removerPergunta(@RequestParam("removepergunta") int index,
            Quiz quiz) {
        quiz.getListaPerguntas().remove(index);

        
        var listaPerguntas = perguntasService.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("quiz", quiz);
        dados.put("listaPerguntas", listaPerguntas);
        dados.put("novaPergunta", new Perguntas());
        return new ModelAndView("quiz/form", dados);
    }
    @GetMapping("/jogar/{id}")
    public ModelAndView jogar(){
        var listaQuizes = service.getAll();
        var listaPerguntas = perguntasService.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("listaQuizes", listaQuizes);
        dados.put("listaPerguntas", listaPerguntas);
        return new ModelAndView("quiz/jogar", dados);
    }
}
