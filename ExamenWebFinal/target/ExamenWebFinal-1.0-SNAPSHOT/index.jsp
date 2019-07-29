<%-- 
    Document   : inicio
    Created on : 27/07/2019, 09:37:28 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXAMEN JSON</title>
    </head>
    <body>
        <h1>EXAMEN  JSON (EDUARDO GUILLEN MALDONADO)</h1> 
        <form method="POST"  action="<%= request.getContextPath()%>/ServletPersona">

            <select id="opcion" name="opcion" >
                <option value="0" >SELECCCIONE LA OPCIÓN...</option>
                <option value="1" >INGRESAR PERSONA FORMATO JSON</option>
                <option value="2" >BUSCAR PERSONA EN FORMATO JSON</option>
                <option value="3">MOSTRAR PERSONAS EN FORMATO JSON</option>
            </select>
             
            <input type="submit" value="Enviar" />    
            

        </form>
    </body>
</html>
