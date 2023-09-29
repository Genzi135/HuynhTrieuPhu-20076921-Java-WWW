package frontend.Controllers;

import backend.models.Product;
import frontend.models.ProductModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Controllers")
public class ServletController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        try {
            Object actionObject = req.getParameter("action");
            if (actionObject != null) {
                String action = actionObject.toString();
                if (action.equals("insert_products")) {
                    ProductModel productModel = new ProductModel();
                    productModel.insert(req, resp);
                    resp.sendRedirect("ProductInsert.jsp");
                }
            } else {
                //resp.sendRedirect("Product.jsp");

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
