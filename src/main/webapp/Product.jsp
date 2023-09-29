<%@ page import="backend.models.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="backend.Services.ProductServices" %>
<%@ page import="backend.emuns.EmpStatus" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/09/2023
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<%
    ProductServices productServices = new ProductServices();
    List<Product> lst = productServices.getActiveProduct();
%>
<table width="70%" align="center" border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>unit</th>
        <th>manufacturer name</th>
        <th>Status</th>
        <th colspan="2"><a href="ProductInsert.jsp">Insert</a></th>

    </tr>
    <%

        for (Product product2 : lst) {

    %>
    <tr>
        <td><%product2.getProduct_id();%></td>
        <td><%product2.getName();%></td>
        <td><%product2.getDescription();%></td>
        <td><%product2.getUnit();%></td>
        <td><%product2.getManufacturer_name();%></td>
        <td><%product2.getStatus();%></td>
        <td><a href="">Update</a></td>
        <td><a href="">Delete</a></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
