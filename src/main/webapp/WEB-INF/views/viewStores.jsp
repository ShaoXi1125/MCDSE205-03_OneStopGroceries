<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>One Stop Groceries - Locate</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">
    <h1 class="text-center mb-4">Our Store Locations</h1>

    <div class="d-flex justify-content-between mb-3">
        <a href="/stores/manage" class="btn btn-primary">Manage Stores</a>
    </div>

    <div class="card">
        <div class="card-header">
            <h2 class="h4">Store List</h2>
        </div>
        <div class="card-body">
            <table class="table table-bordered table-striped">
                <thead class="table-dark">
                    <tr>
                        <th>Name</th>
                        <th>Phone Number</th>
                        <th>Area</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${stores}" var="store">
                        <tr>
                            <td>${store.name}</td>
                            <td>${store.phoneNumber}</td>
                            <td>${store.localities}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
