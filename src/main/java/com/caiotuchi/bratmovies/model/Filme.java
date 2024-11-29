package com.caiotuchi.bratmovies.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "filmes")
public class Filme {

    @Id
    private String id;
    private String titulo;
    private String diretor;
    private int ano;

    public Filme(String titulo, String diretor, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
    }


    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
