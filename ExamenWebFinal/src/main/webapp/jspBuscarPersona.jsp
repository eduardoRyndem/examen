<%-- 
    Document   : jspBuscarPersona
    Created on : 28/07/2019, 10:50:39 PM
    Author     : Dell
--%>

<%@page import="beans.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
        
            Object p=(Object) request.getAttribute("persona");
        
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>BUSQUEDA DE PERSONA</h1>
        <br>
        <a href="index.jsp">Regresar a Inicio</a>
        <br> <br>
        <form  method="POST" action="<%= request.getContextPath() %>/ServletBusquedaPersona" >
            <input type="text" name="busquedaPersona" id="busquedaPersona"/>
            <input type="submit" value="Buscar"/>
        </form>
         
            <%  if(p!=null) { %>
            
            <p><%= p %></p>
            
            <% } %>
    </body>
</html>
