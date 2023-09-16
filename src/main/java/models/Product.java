package models;

import emuns.EmpStatus;
import jakarta.persistence.*;
import jdk.jshell.Snippet;

@Entity
@Table(name = "product")
@Embeddable
public class Product {
    //product (product_id, name, description, unit, manufacturer_name, status)
    @Id
    @Column(name = "product_id")
    private String id;
    @Column
    private String name;
    @Column(name = "description")
    private String desc;
    @Column
    private long unit;
    @Column
    private String manufacturer_name;
    @Column
    private EmpStatus status;

    public Product(String id, String name, String desc, long unit, String manufacturer_name, EmpStatus status) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.unit = unit;
        this.manufacturer_name = manufacturer_name;
        this.status = status;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getUnit() {
        return unit;
    }

    public void setUnit(long unit) {
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
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", unit=" + unit +
                ", manufacturer_name='" + manufacturer_name + '\'' +
                ", status=" + status +
                '}';
    }
}
