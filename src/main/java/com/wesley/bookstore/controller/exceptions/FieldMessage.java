package com.wesley.bookstore.controller.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FieldMessage implements Serializable {

    private String fieldName;
    private String message;
}
