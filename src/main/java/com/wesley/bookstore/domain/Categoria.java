package com.wesley.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categoria {
    private Integer id;
    private String nome;
    private String descricao;

    private List<Livro> livros = new ArrayList<>();
}
