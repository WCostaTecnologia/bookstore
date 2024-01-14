package com.wesley.bookstore.dtos;

import com.wesley.bookstore.domain.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO implements Serializable {

    private Integer id;
    private String nome;
    private String descricao;

    public CategoriaDTO(Categoria obj) {
        super();
        this.id = obj.getId();
        this.nome =obj.getNome();
        this.descricao = obj.getDescricao();


    }
}
