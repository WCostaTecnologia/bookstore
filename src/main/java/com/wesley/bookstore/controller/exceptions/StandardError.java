package com.wesley.bookstore.controller.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandardError {

    private Long timesTemp;
    private Integer status;
    private String error;
}
