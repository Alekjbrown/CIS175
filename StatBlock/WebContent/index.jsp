<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NPC Statblock</title>
</head>
<h1>NPC Statblock Calculator</h1>
<form action="getStatsServlet" method="POST">
<p>
Enter strength score: 
<input type="number" name="str" size="2" value="10">
</p>
<p>
Enter dexterity score:
<input type="number" name="dex" size ="2" value="10">
</p>
<p>
Enter Constitution score:
<input type="number" name="con" size="2" value="10">
</p>
<p>
Enter Intelligence score:
<input type="number" name="int" size="2" value="10">
</p>
<p>
Enter Wisdom score:
<input type="number" name="wis" size="2" value="10">
</p>
<p>
Enter Charisma score:
<input type="number" name="cha" size="2" value="10">
</p>
<input type="submit" value="Calculate Modifiers">
</form>
<body>

</body>
</html>