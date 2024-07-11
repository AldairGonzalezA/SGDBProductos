package org.aldairgonzalez.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.aldairgonzalez.webapp.model.Producto;
import org.aldairgonzalez.webapp.util.JPAUtil;

public class ProductoService  implements IProductoService{

    private EntityManager em;
    
    public ProductoService(){
        this.em = JPAUtil.getEntityManager();
    }
    
    @Override
    public List<Producto> listarProductos() {
        return em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
    }

    @Override
    public void agregarProducto(Producto producto) {
       em.persist(producto);
    }

    @Override
    public void eliminarProducto(int productoId) {
       
    }

    @Override
    public Producto buscarProductoPorId(int ProductoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarProducto(Producto producto) {
        
    }
    
}