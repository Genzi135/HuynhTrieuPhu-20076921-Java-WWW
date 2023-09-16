package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.joda.time.DateTime;

@Entity
@Table
public class Product_Price {
    //product_price (product_id, price_date_time, price, note)
    @Column
    private Product product_id;
    @Column(name = "price_date_time")
    private DateTime date;
    @Column
    private double price;
    @Column
    private String note;

    public Product_Price(Product product_id, DateTime date, double price, String note) {
        this.product_id = product_id;
        this.date = date;
        this.price = price;
        this.note = note;
    }

    public Product_Price() {
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product_Price{" +
                "product_id=" + product_id +
                ", date=" + date +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
