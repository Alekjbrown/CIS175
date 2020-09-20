<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NPC Info</title>
</head>
<body>
<h1>${userInfo.getName()}</h1>
<p>Race: ${userInfo.getRace()}</p>
<p>Age: ${userInfo.getAge()}<p>
<p>Description: ${userInfo.getDescription()}</p>
<br>
<a href="index.jsp">Calculate Modifiers</a>
<br>
<a href="addNPC.jsp">Enter NPC Info</a>

</body>
</html>