<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Manage Stores</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script>
        function confirmDelete(storeId) {
            if (confirm("Are you sure you want to delete this store?")) {
                window.location.href = "/stores/delete/" + storeId;
            }
        }
    </script>
</head>
<body class="container mt-4">
    <h1 class="text-center mb-4">Manage Stores</h1>

    <div class="d-flex justify-content-between mb-3">
        <a href="/stores" class="btn btn-primary">View Stores</a>
    </div>

    <div class="card mb-4">
        <div class="card-header">
            <h2 class="h4">${store.id != null ? 'Edit Store' : 'Add Store'}</h2>
        </div>
        <div class="card-body">
            <form action="${store.id != null ? '/stores/update' : '/stores/add'}" method="post">
                <input type="hidden" name="id" value="${store.id}"/>
                <div class="mb-3">
                    <label class="form-label">Name:</label>
                    <input type="text" name="name" class="form-control" value="${store.name}" required/>
                </div>
                <div class="mb-3">
                    <label class="form-label">Phone:</label>
                    <input type="text" name="phoneNumber" class="form-control" value="${store.phoneNumber}" required/>
                </div>
                <div class="mb-3">
                    <label class="form-label">Localities:</label>
                    <input type="text" name="localities" class="form-control" value="${store.localities}" required/>
                </div>
                <button type="submit" class="btn btn-success">${store.id != null ? 'Update' : 'Save'}</button>
            </form>
        </div>
    </div>

    <h2 class="mb-3">Existing Stores</h2>
    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>Name</th>
                <th>Phone</th>
                <th>Localities</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${stores}" var="store">
                <tr>
                    <td>${store.name}</td>
                    <td>${store.phoneNumber}</td>
                    <td>${store.localities}</td>
                    <td>
                        <a href="/stores/edit/${store.id}" class="btn btn-warning btn-sm">Edit</a>
                        <a href="javascript:void(0)" onclick="confirmDelete('${store.id}')" class="btn btn-danger btn-sm">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
