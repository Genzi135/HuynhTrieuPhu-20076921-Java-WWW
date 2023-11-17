<%@ page import="backend.models.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="backend.Services.ProductServices" %>
<%@ page import="backend.enums.EmployeeStatus" %>
<%@ page import="backend.repositories.ProductRepositories" %>
<%@ page import="backend.Services.EmployeeService" %>
<%@ page import="backend.models.Employee" %>
<%@ page import="backend.Services.CustomerServices" %>
<%@ page import="backend.models.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shopping: Product List</title>

    <style>
        body {
            background-color: darkgreen;
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
    String cusId = request.getParameter("id");
    EmployeeService employeeService = new EmployeeService();
    Employee e = employeeService.findById("1");
    CustomerServices customerServices = new CustomerServices();
    Customer c = customerServices.findById(cusId);

    ProductRepositories productRepositories = new ProductRepositories();
    List<Product> lst = productRepositories.getActiveProduct();

    // Lấy giỏ hàng từ session, hoặc tạo mới nếu chưa có
    List<Product> cartList = (List<Product>) session.getAttribute("cart");
    if (cartList == null) {
        cartList = new ArrayList<>();
        session.setAttribute("cart", cartList);
    }

    if ("post".equalsIgnoreCase(request.getMethod())) {
        String productId = request.getParameter("submitIdProduct");

        if (productId != null && !productId.isEmpty()) {
            Product p = productRepositories.findById(productId);
            cartList.add(p);
        }
    }
%>

<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>unit</th>
        <th>manufacturer name</th>
        <th>Status</th>
        <th><a href="">Cart</a></th>
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
        <td>
            <form method="post">
                <input type="hidden" name="submitIdProduct" value="<%=product2.getProduct_id()%>"/>
                <input type="submit" value="Add to Cart"/>
            </form>
        </td>
    </tr>
    <%
        }
    %>
</table>

<table>
    <h2 style="display: flex; justify-content: center; align-items: center; color: white">Cart list</h2>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>unit</th>
        <th>manufacturer name</th>
        <th>Status</th>
        <th><a href="" style="color: red">Buy</a></th>
    </tr>
    <%
        for (Product product2 : cartList) {
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
    </tr>
    <%
        }
    %>
</table>

</body>
</html>
