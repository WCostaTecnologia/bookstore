package com.wesley.bookstore.service;

import com.wesley.bookstore.domain.Categoria;
import com.wesley.bookstore.dtos.CategoriaDTO;
import com.wesley.bookstore.repositories.CategoriaRepository;
import com.wesley.bookstore.service.exceptions.DataIntegrityViolationException;
import com.wesley.bookstore.service.exceptions.ObjectNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions(
                "Objeto não encontrada id: " + id + " , tipo: " + Categoria.class.getName()));
    }
    public List<Categoria> findAll(){

        return repository.findAll();
    }
    public Categoria create(Categoria obj){
        obj.setId(null);
        return repository.save(obj);
    }
    public Categoria update(Integer id, CategoriaDTO objDto) {
        Categoria obj = findById(id);
        obj.setNome(objDto.getNome());
        obj.setDescricao(objDto.getDescricao());
        return repository.save(obj);
    }
    public void delete(Integer id) {
        findById(id);
        try {
            repository.deleteById(id);
        }
        catch (org.springframework.dao.DataIntegrityViolationException e){
            throw new DataIntegrityViolationException(
                    "Categoria não pode ser deletada! Possui livros associados");
        }
    }
}
