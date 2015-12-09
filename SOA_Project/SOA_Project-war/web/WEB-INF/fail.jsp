<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>FAIL!</h1>
        <h2><%out.println(request.getAttribute("fail"));%></h2>
        <h2><%out.println(request.getAttribute("status"));%></h2>
    </body>
</html>
