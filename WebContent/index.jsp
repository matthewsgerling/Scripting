<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script> 
function format() {
	var fname = document.forms["FormatServlet"]["fname"]; 
	var lname = document.forms["FormatServlet"]["lname"]; 
	var age = document.forms["FormatServlet"]["age"]; 
	
	if (fname.value == ""){ 
        window.alert("Please enter your First name."); 
        return false; 
    }
	
	if (lname.value == ""){ 
        window.alert("Please enter your Last name."); 
        return false; 
    } 
	
	if (age.value == ""){ 
        window.alert("Please enter your Age."); 
        return false; 
    } 
	return true;
}
</script>
<meta charset="ISO-8859-1">
<title>Scripting</title>
</head>
<body>
<h1>Format</h1>
<form name="FormatServlet" action="FormatServlet" onsubmit="return format()" method="post">
Enter First name:
<input type="text" name="fname" size="10">
<br>
Enter Last name:
<input type="text" name="lname" size="10">
<br>
Enter Age:
<input type="text" name="age" size="10">
<br>
<input type = "submit" value="FormatServlet">
</form>
</body>

</html>