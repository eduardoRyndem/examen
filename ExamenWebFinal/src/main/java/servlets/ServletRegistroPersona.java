/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Dell
 */
public class ServletRegistroPersona extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String jsonStringPersona = request.getParameter("nombrePersona").toString();

        if (jsonStringPersona != null) {

            try {
                new PersonaDAO().escribirElementoJSON(jsonStringPersona);
                 request.setAttribute("respuestaPersona", "Usuario Agregado!!!");
            } catch (ParseException ex) {
                Logger.getLogger(ServletRegistroPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
               
            
        }
        request.getRequestDispatcher("registroPersona.jsp").forward(request, response);

    }

}
