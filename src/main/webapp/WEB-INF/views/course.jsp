<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Course List</title>
</head>
<body>
    <h2>Course Available:</h2>
    <ul>
        <c:forEach var="c" items="${courseList}">
            <li>${c}</li>
        </c:forEach>
    </ul>
</body>
</html>
