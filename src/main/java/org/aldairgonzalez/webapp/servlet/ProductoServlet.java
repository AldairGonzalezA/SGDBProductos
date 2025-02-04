
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

@WebServlet("/producto-servlet")
@MultipartConfig
public class ProductoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
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
