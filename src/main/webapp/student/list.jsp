<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/11/2024
  Time: 12:11 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <title>Student List</title>
</head>
<body>
<div class="container py-4">
<h1 class="py-4">Student list</h1>
<table class="table table-bordered table-hover">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Score</th>
    </tr>
    <c:forEach items='${requestScope["students"]}' var="student">
        <tr>
            <td><a class="text-black text-decoration-none" href="/students?action=view&id=${student.getId()}">${student.getId()}</a> </td>
            <td>${student.getName()}</td>
            <td>${student.getScore()}</td>
        </tr>
    </c:forEach>
</table>
<p>
    <a class="btn btn-primary text-white" href="/students?action=create">Add a student</a>
</p>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>
