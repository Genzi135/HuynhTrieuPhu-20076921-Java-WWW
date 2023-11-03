package backend.models;

import jakarta.persistence.*;
import org.joda.time.DateTime;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    //order (order_id, order_date, emp_id, cust_id)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;
    @Column
    private DateTime order_date;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Order_Detail> orderDetailList;

    public Order(DateTime order_date, Employee employee, Customer customer) {
        this.order_date = order_date;
        this.employee = employee;
        this.customer = customer;
    }

    public Order() {
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public DateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(DateTime order_date) {
        this.order_date = order_date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Order_Detail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<Order_Detail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", order_date=" + order_date +
                ", employee=" + employee +
                ", customer=" + customer +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}
