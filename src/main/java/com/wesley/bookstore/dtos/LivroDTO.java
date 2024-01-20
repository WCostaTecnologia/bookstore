package com.wesley.bookstore.dtos;

import com.wesley.bookstore.domain.Livro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.lang.reflect.Constructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivroDTO implements Serializable {

    private Integer id;
    private String titulo;

    public LivroDTO(Livro obj){
        super();
        this.setId(obj.getId());
        this.setTitulo(obj.getTitulo());
    }
}
