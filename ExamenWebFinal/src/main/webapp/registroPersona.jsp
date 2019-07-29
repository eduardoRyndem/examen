<%-- 
    Document   : registroPersona
    Created on : 28/07/2019, 10:01:39 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            String respuesta = (String) request.getAttribute("respuestaPersona");

        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>REGISTRO DE PERSONA EN FORMATO JSON</h1>

        <a href="index.jsp">Regresar a Inicio</a>
        <br/> <br/>
        <form method="POST" action="<%= request.getContextPath()%>/ServletRegistroPersona" >
            <input type="text" name="nombrePersona" id="nombrePersona" />


            <input type="submit" value="Guardar"  />
            <% if (respuesta != null) { %>
            <p><%= respuesta%></p>
            <%}%>
        </form>


    </body>
</html>
