
package org.aldairgonzalez.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.aldairgonzalez.webapp.model.Producto;
import org.aldairgonzalez.webapp.service.ProductoService;

@WebServlet("/producto-servlet")
@MultipartConfig
public class ProductoServlet extends HttpServlet {

    private ProductoService ps;
    
    @Override
    public void init()throws ServletException {
        super.init();
        this.ps = new ProductoService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Producto> productos = ps.listarProductos();
        req.setAttribute("productos", productos);
        req.getRequestDispatcher("./lista-productos/lista-productos.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> datosProducto = new ArrayList<>();
       
        String mensaje = "";
        String nombreProducto = req.getParameter("nombreProducto");
        String marcaProducto = req.getParameter("marcaProducto");
        String descripcion = req.getParameter("descripcion");
        String precioProducto = req.getParameter("precioProducto");
        
        if(nombreProducto.isEmpty()){
           mensaje = "!Error! Campo de nombre vacio";
        } else if(marcaProducto.isEmpty()){
           mensaje = "!Error! Campo de marca vacio";  
        } else if(descripcion.isEmpty()){
           mensaje = "!Error! Campo de descripcion vacio";
        } else if(precioProducto.isEmpty()){
           mensaje = "!Error! Campo de precio vacio";
        } else{
            mensaje = "Datos enviado con exito";
        }
        datosProducto.add(nombreProducto);
        datosProducto.add(marcaProducto);
        datosProducto.add(descripcion);
        datosProducto.add(precioProducto);
        
        req.setAttribute("datosProducto", datosProducto);
        req.setAttribute("mensaje", mensaje);
        getServletContext().getRequestDispatcher("/formulario-productos/formulario-productos.jsp").forward(req, resp);
    }
    
}
