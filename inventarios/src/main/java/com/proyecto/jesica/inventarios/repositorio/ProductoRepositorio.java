package com.proyecto.jesica.inventarios.repositorio;

import com.proyecto.jesica.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{

}
