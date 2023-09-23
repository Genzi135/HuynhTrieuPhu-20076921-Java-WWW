package backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class Order_Detail {
    //order_detail (order_id, product_id, quantity, price, note)
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order_id;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product_id;
    @Column
    private int quantity;
    @Column
    private double price;
    @Column
    private String note;

    public Order_Detail(Order order_id, Product product_id, int quantity, double price, String note) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
        this.note = note;
    }

    public Order_Detail() {
    }

    public Order getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        return "Order_Detail{" +
                "order_id=" + order_id +
                ", product_id=" + product_id +
                ", quantity=" + quantity +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
