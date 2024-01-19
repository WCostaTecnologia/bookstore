package com.wesley.bookstore.service;

import com.wesley.bookstore.domain.Categoria;
import com.wesley.bookstore.domain.Livro;
import com.wesley.bookstore.repositories.CategoriaRepository;
import com.wesley.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DbService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public  void instanciaBaseDeDados(){

        var cat1 = new Categoria( null, "Informatica", "Livros de TI", new ArrayList<>());
        var l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren Ipsum", cat1);
        var l2 = new Livro(null, "View Code ", "Martin Low", "Loren Ipsum 2", null);
        cat1.getLivros().addAll(List.of(l1));

        this.categoriaRepository.saveAll(List.of(cat1));
        this.livroRepository.saveAll(List.of(l1,l2));
    }
}
