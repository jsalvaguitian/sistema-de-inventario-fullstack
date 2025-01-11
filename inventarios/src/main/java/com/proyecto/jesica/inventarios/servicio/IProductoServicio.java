package com.proyecto.jesica.inventarios.servicio;

import com.proyecto.jesica.inventarios.modelo.Producto;
import java.util.List;

public interface IProductoServicio {
    List<Producto> listarProductos();
    Producto buscarProductoPorId(Integer idProducto);
    void guardarProducto(Producto producto);
    void eliminarProducto(Integer idProducto);

}
