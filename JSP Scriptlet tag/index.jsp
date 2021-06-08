<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int d=10;
             String s="JSP"; %>  
 
      <%
         out.println(d);
         out.println(s);
      %>
         
        <h1>Hello World!</h1>
    </body>
</html>
