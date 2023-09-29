package backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class Product_Image {
    //product_image (product_id, image_id, path, alternative)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long image_id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String path;

    private String alternative;

    public Product_Image(Long image_id, Product product, String path, String alternative) {
        this.image_id = image_id;
        this.product = product;
        this.path = path;
        this.alternative = alternative;
    }

    public Product_Image() {
    }

    public Long getImage_id() {
        return image_id;
    }

    public void setImage_id(Long image_id) {
        this.image_id = image_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        return "Product_Image{" +
                "image_id=" + image_id +
                ", product=" + product +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }
}
