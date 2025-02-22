<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>One Stop Groceries - Locate</title>
</head>
<body>
    <h1>Our Store Locate</h1>
    <a href="/stores/manage">Stores Manage</a>
    <table border="1">
        <tr>
            <th>Name: </th>
            <th>Phone Number: </th>
            <th>Area: </th>
        </tr>
        <c:forEach items="${stores}" var="store">
            <tr>
                <td>${store.name}</td>
                <td>${store.phoneNumber}</td>
                <td>${store.localities}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>