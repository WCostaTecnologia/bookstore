package com.wesley.bookstore.service;

import com.wesley.bookstore.domain.Livro;
import com.wesley.bookstore.repositories.LivroRepository;
import com.wesley.bookstore.service.exceptions.ObjectNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id){
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions(
                "Objeto não encontrado id: " + id + " , tipo: " + Livro.class.getName()));
    }
}
