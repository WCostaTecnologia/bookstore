package com.wesley.bookstore.dtos;

import com.wesley.bookstore.domain.Categoria;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO implements Serializable {

    private Integer id;
    @NotEmpty(message = "Campo NOME é requerido")
    @Length(min = 3, max = 150, message = "O campo NOME deve ter  entre 3 e 150 caracteres")
    private String nome;

    @NotEmpty(message = "Campo DESCRIÇÃO é requerido")
    @Length(min = 3, max = 200, message = "O campo DESCRIÇÃO deve ter  entre 3 e 200 caracteres")
    private String descricao;

    public CategoriaDTO(Categoria obj) {
        super();
        this.id = obj.getId();
        this.nome =obj.getNome();
        this.descricao = obj.getDescricao();


    }
}
