package models;

import jakarta.persistence.*;
import org.joda.time.DateTime;

@Entity
@Table(name = "orders")
public class Order {
    //order (order_id, order_date, emp_id, cust_id)
    @Id
    @Column(name = "order_id")
    private String id;
    @Column(name = "order_date")
    private DateTime date;


    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee emp_id;


    @ManyToOne
    @JoinColumn(name = "cus_id")
    private Customer cus_id;

    public Order(String id, DateTime date, Employee emp_id, Customer cus_id) {
        this.id = id;
        this.date = date;
        this.emp_id = emp_id;
        this.cus_id = cus_id;
    }

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public Employee getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Employee emp_id) {
        this.emp_id = emp_id;
    }

    public Customer getCus_id() {
        return cus_id;
    }

    public void setCus_id(Customer cus_id) {
        this.cus_id = cus_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", emp_id=" + emp_id +
                ", cus_id=" + cus_id +
                '}';
    }
}
