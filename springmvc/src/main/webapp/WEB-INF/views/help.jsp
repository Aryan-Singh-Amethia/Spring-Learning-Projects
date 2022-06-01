<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is the help page.</title>
</head>
<body>
   <%
      String name=(String)request.getAttribute("name");
      Integer roll=(Integer)request.getAttribute("roll");
      LocalDateTime now = (LocalDateTime)request.getAttribute("time");
   %>
   <H1>name is <%=name%></H1>
   <h1>roll is <%=roll%></h1>
   <h1>now is <%=now%></h1>
</body>
</html>