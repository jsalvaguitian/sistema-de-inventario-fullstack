package com.proyecto.jesica.inventarios.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class RecursosNoEncontradoExcepcion extends RuntimeException {
    public RecursosNoEncontradoExcepcion(String message) {

      super(message);
    }
}
