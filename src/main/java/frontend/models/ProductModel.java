package frontend.models;

import backend.Services.ProductServices;
import backend.emuns.EmpStatus;
import backend.models.Product;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductModel {

    private ProductServices services;


    public void insert(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String name = req.getParameter("name");
        String desc = req.getParameter("desc");
        String unit = req.getParameter("unit");
        String manu = req.getParameter("manu");
        String status = req.getParameter("status");

        Product product = new Product(name, desc, unit, manu, EmpStatus.valueOf(status));
        services.insert(product);

    }
}
