package com.caiotuchi.bratmovies.repository;

import com.caiotuchi.bratmovies.model.Filme;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmeRepository extends MongoRepository<Filme, String> {
}
