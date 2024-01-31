package com.wesley.bookstore.service;

import com.wesley.bookstore.domain.Livro;
import com.wesley.bookstore.dtos.LivroDTO;
import com.wesley.bookstore.repositories.LivroRepository;
import com.wesley.bookstore.service.exceptions.ObjectNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    @Autowired
    private CategoriaService categoriaService;

    public Livro findById(Integer id){
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions(
                "Objeto não encontrado id: " + id + " , tipo: " + Livro.class.getName()));
    }
    public List<Livro> findAll(Integer idCategoria){
        categoriaService.findById(idCategoria);
       return repository.findAllByCategoria(idCategoria);
    }

    public Livro update(Integer id, Livro obj) {
        Livro newObj = findById(id);
        updateData(newObj,obj);
        return repository.save(newObj);
    }

    private void updateData(Livro newObj, Livro obj) {
        newObj.setTitulo(obj.getTitulo());
        newObj.setNome(obj.getNome());
        newObj.setText(obj.getText());
    }
}