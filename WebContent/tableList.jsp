<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tableList.jsp</title>
</head>
<body>
	<style>
table, th, td {
    border: 3px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 10px;
    text-align: left;    
}
</style>
</head>
<body>
<center>
<h1>2010 ~ 2016년, 출생수 Top10 </h1>
<h3>-연도별, 성별(남자Top10, 여자Top10)- </h3>

<table style="width:70%">
<c:forEach items="${requestScope.python}" var="v">
  <tr>
  	<td><b>${v[4]}</b></td>
    <td>${v[1]}</td>
    <td>${v[2]}</td>
    <td>${v[3]}</td>
    
  </tr>
  </c:forEach>
</table>

</center>


</body>
</html>