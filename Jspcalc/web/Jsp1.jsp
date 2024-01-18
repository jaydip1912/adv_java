<%-- 
    Document   : Jsp1
    Created on : 23-Dec-2023, 4:48:48 am
    Author     : jaydi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculate <%= request.getParameter("a1") %></h1>
        <%
            String num1=request.getParameter("n1");
            String num2=request.getParameter("n2");
            
            int i=Integer.parseInt(num1);
            int j=Integer.parseInt(num2);
            int k=0;
            
            String str=request.getParameter("a1");
            if(str.equals("add"))
            k=i+j;
            
            if(str.equals("sub"))
            k=i-j;
            
            if(str.equals("mul"))
            k=i*j;
            
            if(str.equals("div"))
            k=i/j;  
        
        %>
            Result is:<%=k%>
    </body>
</html>
