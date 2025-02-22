<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Manage Stores</title>
</head>
<body>
    <h1>Manage Stores</h1>
    <a href="/stores">View Stores</a>
    
    <h2>Add/Edit Store</h2>
    <form action="/stores/add" method="post">
        <input type="hidden" name="id" value="${store.id}"/>
        <label>Name: <input type="text" name="name" value="${store.name}"/></label><br>
        <label>Phone: <input type="text" name="phoneNumber" value="${store.phoneNumber}"/></label><br>
        <label>Service Area: <input type="text" name="localities" value="${store.localities}"/></label><br>
        <input type="submit" value="Save"/>
    </form>
    
    <h2>Existing Stores</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Phone</th>
            <th>Service Area</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${stores}" var="store">
            <tr>
                <td>${store.name}</td>
                <td>${store.phoneNumber}</td>
                <td>${store.localities}</td>
                <td>
                    <a href="/stores/delete/${store.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
