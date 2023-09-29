package backend.Services;

import backend.models.Product;
import backend.repositories.ProductRepositories;

import java.util.List;

public class ProductServices {
    private final ProductRepositories repositories;

    public ProductServices() {
        repositories = new ProductRepositories();
    }

    public void insert(Product product) {
        repositories.add(product);
    }

    public List<Product> getActiveProduct() {
        return repositories.getActiveProduct();
    }

}
