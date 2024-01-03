package com.wesley.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Livro {
    private Integer id;
    private String titulo;
    private String nome;
    private String text;

    private Categoria categoria;
}
