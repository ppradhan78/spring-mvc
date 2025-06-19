<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>Fruit List</h2>
    <ul>
        <c:forEach var="fruit" items="${fruits}">
            <li>${fruit}</li>
        </c:forEach>
    </ul>
</body>
</html>
