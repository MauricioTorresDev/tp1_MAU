package pe.edu.vallegrande.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private static List<String> obtenerLista(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<String> lista;
        if(session.getAttribute("contactos") == null){
            lista = new ArrayList<>();
            session.setAttribute("contactos", lista);
        } else {
            lista = (List<String>) session.getAttribute("contactos");
        }
        return lista;
    }

    public static void agregar(HttpServletRequest request) {
        // Datos
        String contacto = request.getParameter("contacto");
        // PRoceso
        List<String> lista = obtenerLista(request);
        lista.add(contacto);
    }

    public static void eliminar(HttpServletRequest request) {
        // Datos
        String contacto = request.getParameter("contacto");
        // PRoceso
        List<String> lista = obtenerLista(request);
        lista.remove(contacto);
    }


}
