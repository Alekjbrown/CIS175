<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add NPC</title>
</head>
<body>
<form action="addNPCServlet" method="post">
<p>
Enter NPC Name: 
<input type="text" name="name" required="required" >
</p>
<p>
Enter NPC Race: 
<input type="text" name="race" required="required">
</p>
<p>
Enter NPC Age: 
<input type="number" name="age" required="required">
</p>
<p>
Enter short description of NPC: 
<input type="text" name="desc" required="required">
</p>
<input type="submit" value="Create NPC">
</form>
</body>
</html>