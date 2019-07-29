<%-- 
    Document   : jspPersonas
    Created on : 29/07/2019, 02:34:58 AM
    Author     : Dell
--%>

<%@page import="beans.Persona"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <% List<Persona> listaP =(List<Persona>) request.getAttribute("personas"); %>
    </head>
    <body>
        <h1>LISTADO DE PERSONAS</h1>
        <br> <br>
        <a href="index.jsp">Regresar a Inicio</a>
        <br><br>
        
        <p><%= listaP.toString() %></p>
    </body>
    
    
</html>
