package backend.models;

import backend.emuns.EmpStatus;
import jakarta.persistence.*;


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

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturer_name='" + manufacturer_name + '\'' +
                ", status=" + status +
                '}';
    }
}
