package com.wesley.bookstore.service;

import com.wesley.bookstore.domain.Categoria;
import com.wesley.bookstore.repositories.CategoriaRepository;
import com.wesley.bookstore.service.exceptions.ObjectNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions(
                "Objeto não encontrado id: " + id + " tipo: " + Categoria.class.getName()));
    }
}
