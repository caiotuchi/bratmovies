package com.caiotuchi.bratmovies.controller;

import com.caiotuchi.bratmovies.model.Filme;
import com.caiotuchi.bratmovies.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<Filme> getFilmes() {
        return filmeService.listarFilmes();
    }

    @PostMapping
    public Filme adicionarFilme(@RequestBody Filme filme) {
        return filmeService.salvarFilme(filme);
    }

}
