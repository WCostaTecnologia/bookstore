package com.wesley.bookstore.controller;

import com.wesley.bookstore.domain.Livro;
import com.wesley.bookstore.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Livro> finById(@PathVariable Integer id){
        Livro livro = service.findById(id);
         return ResponseEntity.ok().body(livro);
    }

}
