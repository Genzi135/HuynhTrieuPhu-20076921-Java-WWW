package backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class Product_Image {
    //product_image (product_id, image_id, path, alternative)
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product_id;
    @Id
    @Column(name = "image_id")
    private String id;
    @Column
    private String path;
    @Column
    private String alternative;

    public Product_Image(Product product_id, String id, String path, String alternative) {
        this.product_id = product_id;
        this.id = id;
        this.path = path;
        this.alternative = alternative;
    }

    public Product_Image() {
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                "product_id=" + product_id +
                ", id='" + id + '\'' +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }
}
