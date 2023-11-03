package backend.models;

import backend.emuns.EmpStatus;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "product")
@NamedQueries(value = {
        @NamedQuery(name = "Product.findAll", query = "from  Product where status=1"),
        @NamedQuery(name = "Product.findById", query = "select id from  Product where id=product_id")
})
public class Product {
    //product (product_id, name, description, unit, manufacturer_name, status)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    private String name;

    private String description;

    private String unit;

    private String manufacturer_name;

    private EmpStatus status;

    @OneToMany(mappedBy = "order_detail_id")
    private List<Order_Detail> order_detailList;

    @OneToMany(mappedBy = "image_id")
    private List<Product_Image> productImageList;

    @OneToMany(mappedBy = "price_id")
    private List<Product_Price> productPriceList;

    public Product(String name, String description, String unit, String manufacturer_name, EmpStatus status) {
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturer_name = manufacturer_name;
        this.status = status;
    }

    public Product() {
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturer_name() {
        return manufacturer_name;
    }

    public void setManufacturer_name(String manufacturer_name) {
        this.manufacturer_name = manufacturer_name;
    }

    public EmpStatus getStatus() {
        return status;
    }

    public void setStatus(EmpStatus status) {
        this.status = status;
    }

    public List<Order_Detail> getOrder_detailList() {
        return order_detailList;
    }

    public void setOrder_detailList(List<Order_Detail> order_detailList) {
        this.order_detailList = order_detailList;
    }

    public List<Product_Image> getProductImageList() {
        return productImageList;
    }

    public void setProductImageList(List<Product_Image> productImageList) {
        this.productImageList = productImageList;
    }

    public List<Product_Price> getProductPriceList() {
        return productPriceList;
    }

    public void setProductPriceList(List<Product_Price> productPriceList) {
        this.productPriceList = productPriceList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturer_name='" + manufacturer_name + '\'' +
                ", status=" + status +
                ", order_detailList=" + order_detailList +
                ", productImageList=" + productImageList +
                ", productPriceList=" + productPriceList +
                '}';
    }
}
