package br.univille.projetoquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetoquiz.service.RankService;
@Controller
@RequestMapping("/rank")
public class RankController {

    @Autowired
    private RankService service;

    @GetMapping
    public ModelAndView index() {
        var listaRank = service.getAll();
        return new ModelAndView("rank/index",
                "listarank", listaRank);
    }

    // // @GetMapping("/novo")
    // public ModelAndView novo() {
    //     var novoRank = new Rank();
    //     var listaUsuario = br.univille.projetoquiz.service.UsuarioService.getAll();
    //     HashMap<String, Object> dados = new HashMap<>();
    //     dados.put("Rank", novoRank);
    //     dados.put("listaUsuario", listaUsuario);
    //     dados.put("novoUsuario", new Usuario());
    //     return new ModelAndView("Rank/form", dados);
    }