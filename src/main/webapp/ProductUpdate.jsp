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
    <title>Product Update</title>
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


    // Kiểm tra nếu có dữ liệu được gửi từ form
    if ("post".equalsIgnoreCase(request.getMethod())) {
        String name = request.getParameter("name");
        String desc = request.getParameter("desc");
        String unit = request.getParameter("unit");
        String manu = request.getParameter("manu");
        ProductStatus status = ProductStatus.valueOf(request.getParameter("status"));

        // Kiểm tra xem các trường có giá trị không trống hay không
        if (name != null && !name.isEmpty() && desc != null && !desc.isEmpty() &&
                unit != null && !unit.isEmpty() && manu != null && !manu.isEmpty()) {

            product.setName(name);
            product.setDescription(desc);
            product.setUnit(unit);
            product.setManufacturer(manu);
            product.setStatus(status);

            // In ra console để kiểm tra
            System.out.println(product.toString());

            // Thực hiện insert
            productServices.update(product);

            // Chuyển hướng lại đến trang Product.jsp
            response.sendRedirect("Product.jsp");
        } else {
            // Hiển thị thông báo nếu có trường nào đó không được nhập
            out.println("<p class='error'>Please fill in all fields.</p>");
        }
    }
%>
<form method="post">
    <label for="name">Name:</label>
    <input type="text" name="name" id="name" required value="<%=product.getName()%>"/><br/>

    <label for="desc">Description:</label>
    <input type="text" name="desc" id="desc" required value="<%=product.getDescription()%>"/><br/>

    <label for="unit">Unit:</label>
    <input type="text" name="unit" id="unit" required value="<%=product.getUnit()%>"/><br/>

    <label for="manu">Manufacturer:</label>
    <input type="text" name="manu" id="manu" required value="<%=product.getManufacturer()%>"/><br/>

    <label for="status">Status:</label>
    <select name="status" id="status">
        <option value="ACTIVE" label="ACTIVE">ACTIVE</option>
        <option value="IN_ACTIVE" label="IN_ACTIVE">IN_ACTIVE</option>
        <option value="TERMINATED" label="TERMINATED">TERMINATED</option>
    </select><br/>

    <input type="submit" value="Update"/>
    <input type="reset" value="Clear"/>
</form>
</body>
</html>
