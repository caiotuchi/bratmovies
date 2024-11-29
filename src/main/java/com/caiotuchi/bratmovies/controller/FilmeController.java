package com.caiotuchi.bratmovies.controller;

import com.caiotuchi.bratmovies.model.Filme;
import com.caiotuchi.bratmovies.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerFilme(@PathVariable String id) {
        boolean removido = filmeService.removerFilmePorId(id);
        if (removido) {
            return ResponseEntity.noContent().build(); // Retorna 204
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404
        }
    }

}
