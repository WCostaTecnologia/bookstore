package com.wesley.bookstore.service;

import com.wesley.bookstore.domain.Categoria;
import com.wesley.bookstore.domain.Livro;
import com.wesley.bookstore.repositories.CategoriaRepository;
import com.wesley.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DbService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public  void instanciaBaseDeDados(){

        Categoria cat1 = new Categoria( null, "Informatica", "Livros de TI", new ArrayList<>());
        Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren Ipsum", cat1);
        cat1.getLivros().addAll(Arrays.asList(l1));

        this.categoriaRepository.saveAll(Arrays.asList(cat1));
        this.livroRepository.saveAll(Arrays.asList(l1));
    }


}
