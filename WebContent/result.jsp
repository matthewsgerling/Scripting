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
<p>${userPhotoReceipt.getReceipt()} Your Receipt is: <br />
&#36;${userReceipt.getEightxten()} 8x10's <br />
&#36;${userReceipt.getFourxsix()} 4x6's <br />
&#36;${userReceipt.getWallet()} Wallets <br />
&#36;${userReceipt.getTotal()} Total price <br />

</p>
</body>
</html>