<%@ page import="backend.Services.CustomerServices" %>
<%@ page import="backend.models.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Authentication</title>
    <style>
        body {
            background-color: darkgreen;
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
    CustomerServices services = new CustomerServices();


    if ("post".equalsIgnoreCase(request.getMethod())) {
        String name = request.getParameter("name");

        Customer c = services.findByName(name);
        if (c != null) {
            response.sendRedirect("Shopping.jsp?id=" + c.getId());
        } else {
            response.sendRedirect("CustomerAuthentication.jsp");
        }

    }
%>

<div style="display: flex; justify-content: center; align-items: center">

    <h3>If you are new Customer, pls click here >>> </h3>
    <div style="background-color: #45a049; border-radius:10px; width: 150px;height: 40px; display: flex; justify-content: center; align-items: center; margin-left: 10px">
        <a href="NewCustomer.jsp" style="font-weight: bold; color: white">
            New customer
        </a>
    </div>
</div>
<form method="post">

    <div>
        <div>
            <label>Name</label>
            <input type="text" required id="name" name="name"/>
        </div>

        <div>
            <label>Email</label>
            <input type="text" required id="email" name="email"/>
        </div>

        <div>
            <label>Phone</label>
            <input type="text" required id="phone" name="phone"/>
        </div>
        <div>
            <button type="submit" value="submit">Submit</button>
        </div>
    </div>
</form>
</body>
</html>
