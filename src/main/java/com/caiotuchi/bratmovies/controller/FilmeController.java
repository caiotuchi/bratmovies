package com.caiotuchi.bratmovies.controller;

import com.caiotuchi.bratmovies.model.Filme;
import com.caiotuchi.bratmovies.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
