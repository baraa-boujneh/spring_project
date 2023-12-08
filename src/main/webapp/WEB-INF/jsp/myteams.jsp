<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html> <head> <meta charset="utf-8"> <title>Teams Management</title>
<link rel="stylesheet" type="text/css"
href="<%=request.getContextPath()%>/css/style.css"/> </head>
<body> <div>

<div>
<form action="/teams/add" method="post">
<table>
<tr><td>Name</td><td> <input type="text" name="name"/></td></tr>
<tr><td>Budget</td> <td> <input type="text" name="budget" /></td> </tr>

<tr><td> <input type="submit" name="action" value="save"/></td></tr>
</table>
</form>
</div>
<table class="tabteams"> <tr> <th>REF</th><th>Name</th><th>Budget</th> </tr>
<c:forEach items="${teamsbbb}" var="t">
<tr>

<td>${t.idTeam}</td><td>${t.name}</td><td>${t.budget}</td>
<td> <a onclick="return confirm('Please Confirm')"
href="/teams/delete?ref=${t.idTeam}&mc=${motCle}"> Delete </a>
</td>

<td> <a href="/teams/edit?ref=${t.idTeam}&name=${t.name}&budget=${t.budget} &edit=0&mc=${motCle}">Edit</a> </td>
</tr>
</c:forEach>
</table> </div> </body> </html>