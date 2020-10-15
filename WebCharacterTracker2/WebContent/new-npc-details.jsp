<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Stat Block</title>
</head>
<body>
	<form action="createNewNPCServlet" method="post">
		Name: <input type="text" name="npcName"><br>
		Race: <input type="text" name="npcRace"><br>
		Age: <input type="number" name="npcAge"><br>

		<input type="submit" value="Create NPC and Add Statblock">
	</form>
	<a href="index.html">Go Home</a>
</body>
</html>