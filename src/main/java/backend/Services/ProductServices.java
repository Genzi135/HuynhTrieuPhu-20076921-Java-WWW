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

    public void update(Product product) {
        repositories.update(product);
    }

    public List<Product> getActiveProduct() {
        return repositories.getActiveProduct();
    }

    public Product findById(String id) {
        return repositories.findById(id);
    }

    public void delete(Product product) {
        repositories.delete(product);
    }

}
