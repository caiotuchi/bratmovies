package com.caiotuchi.bratmovies.service;

import com.caiotuchi.bratmovies.model.Filme;
import com.caiotuchi.bratmovies.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> listarFilmes() {
        return filmeRepository.findAll();
    }
}
