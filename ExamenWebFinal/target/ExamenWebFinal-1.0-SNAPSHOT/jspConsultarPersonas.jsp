<%-- 
    Document   : jspConsultarPersonas
    Created on : 28/07/2019, 10:50:11 PM
    Author     : Dell
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>CONSULTAR PERSONAS </h1>
        <br/>
        <a href="index.jsp">Regresar a Inicio</a>
        <br> <br>
        
        <form action="<%= request.getContextPath() %>/ServletConsultarPersona"  method="GET">
            <input type="submit" value="Consultar"/>
        </form>
           
    </body>
</html>
