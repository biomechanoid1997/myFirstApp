<%
String header = "Apache Tomcat";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>first JSP app</title>
</head>
<body>
<h2><%= header %></h2>
<p>Today <%= new java.util.Date() %></p>
</body>
</html>