<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP - Hello World</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
        }

        h1 {
            color: #333;
        }

        div {
            margin-top: 20px;
        }

        label {
            font-weight: bold;
            margin-right: 10px;
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
<h1><%= "Hello World!" %>
</h1>
<div>
    <label>Admin:</label>
    <a href="Product.jsp">Product List</a>
</div>
<div>
    <label>Employee:</label>
    <a href="CustomerAuthentication.jsp">Shopping</a>
</div>
</body>
</html>
