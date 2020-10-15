<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Statblock</title>
</head>
<body>
	<h1>Add New Statblock</h1>
	<form action="addStatblockServlet" method="post">
		Strength: <input type="number" name="npcStrength"><br>
		Dexterity: <input type="number" name="npcDexterity"><br>
		Constitution: <input type="number" name="npcConstitution"><br>
		Intelligence: <input type="number" name="npcIntelligence"><br>
		Wisdom: <input type="number" name="npcWisdom"><br>
		Charisma: <input type="number" name="npcCharisma"><br>
	</form>
	<br>
	<form action="index.html">
		<input type="submit" value="Home">
	</form>
</body>
</html>