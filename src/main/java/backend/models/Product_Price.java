package backend.models;

import jakarta.persistence.*;
import org.joda.time.DateTime;

@Entity
@Table
public class Product_Price {
    //product_price (product_id, price_date_time, price, note)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long price_id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private DateTime price_date_time;

    private long price;

    private String note;

    public Product_Price(Long price_id, Product product, DateTime price_date_time, long price, String note) {
        this.price_id = price_id;
        this.product = product;
        this.price_date_time = price_date_time;
        this.price = price;
        this.note = note;
    }

    public Product_Price() {
    }

    public Long getPrice_id() {
        return price_id;
    }

    public void setPrice_id(Long price_id) {
        this.price_id = price_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public DateTime getPrice_date_time() {
        return price_date_time;
    }

    public void setPrice_date_time(DateTime price_date_time) {
        this.price_date_time = price_date_time;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
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
                "price_id=" + price_id +
                ", product=" + product +
                ", price_date_time=" + price_date_time +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
