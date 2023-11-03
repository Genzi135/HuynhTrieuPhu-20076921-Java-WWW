<%@ page import="frontend.models.ProductModel" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/09/2023
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Insert</title>
</head>
<body>
<%
    ProductModel productModel = new ProductModel();

    if ("insert".equals(request.getParameter("action"))) {
        productModel.insert(request, response);
        response.sendRedirect("index.jsp"); // Chuyển hướng tới trang thông báo thành công
    }
%>
<form action="Controllers?actions=insert_products" method="post">
    Name: <input name="name"/><br/>
    Description: <input name="desc"/><br/>
    Unit: <input name="unit"/><br/>
    Manufacturer: <input name="manu"/><br/>
    Status: <select name="status">
    <option value="1" label="ACTIVE">ACTIVE</option>
    <option value="0" label="IN_ACTIVE">IN_ACTIVE</option>
    <option value="-1" label="TERMINATED">TERMINATED</option>
</select>
    <input type="submit" value="insert"/>
    <input type="reset" value="clear"/>
</form>
</body>
</html>
