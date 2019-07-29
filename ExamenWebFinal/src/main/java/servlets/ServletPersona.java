/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class ServletPersona extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String liquorType = request.getParameter("Type");

        int opcion = (Integer.parseInt(request.getParameter("opcion")) > 0 && request.getParameter("opcion") != null) ? Integer.parseInt(request.getParameter("opcion")) : 0;

        switch (opcion) {
            case 1:
                //REDIRECCIONA AL FORMULARIO DE REGISTRO JSON DE LA PERSONA
                request.getRequestDispatcher("registroPersona.jsp").forward(request, response);
                break;
            case 2:
                //REDIRECCIONA LA BUSQUEDA DE LAS PERSONAS EN FORMATO JSON
                request.getRequestDispatcher("jspBuscarPersona.jsp").forward(request, response);

                break;
            case 3:
                //REDIRECCIONA LA BUSQUEDA DE TODAS LAS PERSONAS
                
                //request.getRequestDispatcher("jsp").forward(request, response);
                request.getRequestDispatcher("jspConsultarPersonas.jsp").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("inicio.jsp").forward(request, response);
                break;

        }

    }

}
