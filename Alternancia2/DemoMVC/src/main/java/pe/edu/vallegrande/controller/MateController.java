package pe.edu.vallegrande.controller;

import java.util.List;
import pe.edu.vallegrande.dto.Dto1;
import pe.edu.vallegrande.dto.RowDto;
import pe.edu.vallegrande.service.MateService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/Saludo","/mcdmcm","/tabla"})
public class MateController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getServletPath();
        switch(path){
            case "/Saludo":
                saludo(request,response);
                break;
            case "/mcdmcm":
                mcdmcm(request,response);
                break;
            case "/tabla":
                tabla(request,response);
                break;
        }

    }

    private void tabla(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        // Datos
        String tipo = request.getParameter("tabla");
        int num = Integer.parseInt(request.getParameter("num"));
        // Proceso
        MateService service = new MateService();
        List<RowDto> tabla = null;
        String titulo = "";
        switch (tipo){
            case "S":
                tabla = service.tablaSumar(num);
                titulo = "Tabla de SUMAR";
                break;
            case "M":
                tabla = service.tablaMultiplicar(num);
                titulo = "Tabla de MULTIPLICAR";
                break;
        };
        // Enviando la respuesta
        request.setAttribute("titulo",titulo);
        request.setAttribute("tabla",tabla);
        RequestDispatcher rd = request.getRequestDispatcher("tabla.jsp");
        rd.forward(request,response);
    }

    private void mcdmcm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        // Datos
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        // Proceso
        MateService service = new MateService();
        int mcd = service.calcularMCD(num1, num2);
        int mcm = service.calcularMCM(num1, num2);
        // Preparando la respuesta
        Dto1 dto = new Dto1();
        dto.setNum1(num1);
        dto.setNum2(num2);
        dto.setMcd(mcd);
        dto.setMcm(mcm);
        // Enviando la respuesta
        request.setAttribute("dto",dto);
        RequestDispatcher rd = request.getRequestDispatcher("mate1.jsp");
        rd.forward(request,response);
    }

    private void saludo(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Hola mundo");
    }


}
