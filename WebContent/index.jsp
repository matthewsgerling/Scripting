<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Photo Receipt</title>
</head>
<body>
<h1>Photo Receipt</h1>
<form action="getReceiptServlet" method="post">
Enter the number of 8x10 pictures you have:
<input type="text" name="8x10" size="10">
<br>
Enter the number of 4x6 pictures you have:
<input type="text" name="4x6" size="10">
<br>
Enter the number of Wallets you have:
<input type="text" name="Wallet" size="10">
<br>
<input type="submit" value="Calculate Receipt" />
</form>
</body>
</html>