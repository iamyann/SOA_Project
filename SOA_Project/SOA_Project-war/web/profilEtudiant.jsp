<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        Ceci est la page de profil de : 
        <%
            out.println(request.getAttribute("prenom"));
            out.println(request.getAttribute("nom"));
            out.println(request.getAttribute("email"));  
        %>
    </body>
</html>
