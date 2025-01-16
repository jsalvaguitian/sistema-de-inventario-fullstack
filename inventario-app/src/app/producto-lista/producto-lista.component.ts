import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductoServiceService } from '../producto-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-producto-lista',
  standalone: false,
  
  templateUrl: './producto-lista.component.html',
  styleUrl: './producto-lista.component.css'
})
export class ProductoListaComponent {
  productos: Producto[];

  constructor(private productoService: ProductoServiceService, private enrutador: Router){

  }

  ngOnInit(){
    //Cargar los productos
    this.obtenerProductos();
  }

  private obtenerProductos(){
    //Recibo los datos del observable al suscribirnos
    this.productoService.obtenerProductosLista().subscribe(
      (datos =>{
        this.productos = datos;
      })
    )
  }

  editarProducto(id:number){
    this.enrutador.navigate(['editar-producto',id])
  }

  eliminarProducto(id:number){
    this.productoService.eliminarProducto(id).subscribe({
      next:(datos) => this.obtenerProductos(),
      error:(errores)=> console.log(errores)
    })
    

  }


}
