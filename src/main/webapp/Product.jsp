<%@ page import="backend.models.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="backend.Services.ProductServices" %>
<%@ page import="backend.enums.EmployeeStatus" %>
<%@ page import="backend.repositories.ProductRepositories" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
    <style>
        body {
            background-color: blueviolet;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        table {
            width: 70%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: aliceblue;
            border: 1px solid #ddd;
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        a {
            text-decoration: none;
            padding: 8px 16px;
            background-color: #4CAF50;
            color: white;
            border-radius: 4px;
        }

        a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<%
    ProductRepositories productRepositories = new ProductRepositories();
    List<Product> lst = productRepositories.getActiveProduct();
%>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>unit</th>
        <th>manufacturer name</th>
        <th>Status</th>
        <th colspan="2" style="background-color: #45a049"><a href="ProductInsert.jsp" style="width: 100%">Insert</a>
        </th>
    </tr>
    <%
        for (Product product2 : lst) {
    %>
    <tr>
        <td><%= product2.getProduct_id()%>
        </td>
        <td><%= product2.getName()%>
        </td>
        <td><%= product2.getDescription()%>
        </td>
        <td><%= product2.getUnit()%>
        </td>
        <td><%= product2.getManufacturer()%>
        </td>
        <td><%= product2.getStatus()%>
        </td>
        <td><a href="ProductUpdate.jsp?id=<%=product2.getProduct_id()%>">Update</a></td>
        <td><a href="ProductDelete.jsp?id=<%=product2.getProduct_id()%>">Delete</a></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
