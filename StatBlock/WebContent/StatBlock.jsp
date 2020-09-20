<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stat Modifiers</title>
</head>
<body>
 <h1> Stat Block Modifiers</h1>
 <table class="table table-dark">
    <thead>
      <tr>
        <th scope="col"></th>
        <th scope="col">Str</th>
        <th scope="col">Dex</th>
        <th scope="col">Con</th>
        <th scope="col">Int</th>
        <th scope="col">Wis</th>
        <th scope="col">Cha</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th scope="row">Attribute</th>
        <td>${userStats.getStrScore()}</td>
        <td>${userStats.getDexScore()}</td>
        <td>${userStats.getConScore()}</td>
        <td>${userStats.getIntScore()}</td>
        <td>${userStats.getWisScore()}</td>
        <td>${userStats.getChaScore()}</td>
      </tr>
      <tr>
        <th scope="row">Modifier</th>
        <td>${userStats.getStrength()}</td>
        <td>${userStats.getDexterity()}</td>
        <td>${userStats.getConstitution()}</td>
        <td>${userStats.getIntelligence()}</td>
        <td>${userStats.getWisdom()}</td>
        <td>${userStats.getCharisma()}</td>
      </tr>
    </tbody>
  </table>
 
 <a href="index.jsp">Select Different Scores</a><br>
 <a href="addNPC.jsp">Add NPC Info</a>
</body>
</html>