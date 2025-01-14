package com.proyecto.jesica.inventarios.controlador;

import com.proyecto.jesica.inventarios.modelo.Producto;
import com.proyecto.jesica.inventarios.servicio.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/CONTEXT-PATH (inventario-app)
@RequestMapping("/inventario-app")
@CrossOrigin(value="http://localhost:4200")
public class ProductoControlador {
    private static  final Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoServicio productoServicio;

    //http:localhost:8080/inventario-app/productos
    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        List<Producto> productos = this.productoServicio.listarProductos();
        logger.info("Productos obtenidos");
        productos.forEach(producto -> logger.info(producto.toString())); //imprimimos la info en la terminal

        return productos;
    }

    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto){
        logger.info("Producto a agregar: " + producto);
        return this.productoServicio.guardarProducto(producto);
    }
}
