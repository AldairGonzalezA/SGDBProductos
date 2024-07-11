package org.aldairgonzalez.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Productos")
public class Producto {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int productoId;
    private String nombreProducto;
    private String marcaProducto;
    private String descripcionProducto;
    private double precio;

    public Producto() {
    }

    public Producto(String nombreProducto, String marcaProducto, String descripcionProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
    }
    
    public Producto(int productoId, String nombreProducto, String marcaProducto, String descripcionProducto, double precio) {
        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "productoId=" + productoId + ", nombreProducto=" + nombreProducto + ", marcaProducto=" + marcaProducto + ", descripcionProducto=" + descripcionProducto + ", precio=" + precio + '}';
    }
    
    
}
