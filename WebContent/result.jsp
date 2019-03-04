<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${FormCreator.getFormat()} <br />
Full name:
${Format.getFName()} <br />
${Format.getLName()}<br />
Age:
${Format.getAge()}<br />

</p>
<a href="index.jsp">Click to go again</a>

</body>
</html>