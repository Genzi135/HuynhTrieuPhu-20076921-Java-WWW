<%@ page import="backend.Services.ProductServices" %>
<%@ page import="backend.enums.ProductStatus" %>
<%@ page import="backend.models.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String id = request.getParameter("id");
    ProductServices productServices = new ProductServices();
    Product product = productServices.findById(id);

%>
<html>
<head>
    <title>Product Delete</title>
    <style>
        body {
            background-color: blueviolet;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        form {
            width: 50%;
            margin: 20px auto;
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        input, select {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"], input[type="reset"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover, input[type="reset"]:hover {
            background-color: #45a049;
        }

        p.error {
            color: red;
            margin-top: 5px;
        }
    </style>
</head>
<body>
<%
    if ("post".equalsIgnoreCase(request.getMethod())) {
        productServices.delete(product);
        response.sendRedirect("Product.jsp");
    }
%>

<form method="post">
    <h1 style="font-size: large;">REVIEW PRODUCT</h1>
    <label for="name">Name:</label>
    <input type="text" name="name" id="name" required value="<%=product.getName()%>" readonly/><br/>

    <label for="desc">Description:</label>
    <input type="text" name="desc" id="desc" required value="<%=product.getDescription()%>" readonly/><br/>

    <label for="unit">Unit:</label>
    <input type="text" name="unit" id="unit" required value="<%=product.getUnit()%>" readonly/><br/>

    <label for="manu">Manufacturer:</label>
    <input type="text" name="manu" id="manu" required value="<%=product.getManufacturer()%>" readonly/><br/>

    <label for="status">Status:</label>
    <input type="text" name="status" id="status" required value="<%=product.getStatus()%>" readonly/><br/>

    <input type="submit" value="Delete"/>

</form>
</body>
</html>
