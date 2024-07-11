package org.aldairgonzalez.webapp.service;

import java.util.List;
import org.aldairgonzalez.webapp.model.Producto;

public interface IProductoService {
    
    public List<Producto> listarProductos();
    
    public void agregarProducto(Producto producto);
    
    public void eliminarProducto(int productoId);
    
    public Producto buscarProductoPorId(int ProductoId);
    
    public void editarProducto(Producto producto);
    
   
}
