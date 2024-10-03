package pe.edu.vallegrande.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet({"/carrito_agregar","/carrito_eliminar"})
public class CarritoController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch(path){
            case "/carrito_agregar":
                carritoAgregar(request,response);
                break;
            case "/carrito_eliminar":
                carritoEliminar(request,response);
                break;
        }
    }

    private void carritoEliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Proceso
        Carrito.eliminar(request);
        // Reporte
        RequestDispatcher rd = request.getRequestDispatcher("carrito.jsp");
        rd.forward(request,response);
    }

    private void carritoAgregar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Proceso
        Carrito.agregar(request);
        // Reporte
        RequestDispatcher rd = request.getRequestDispatcher("carrito.jsp");
        rd.forward(request,response);
    }
}
