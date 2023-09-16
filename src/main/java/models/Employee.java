package models;

import emuns.EmpStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
@Embeddable
public class Employee {
    @Id
    @Column(name = "emp_id")
    private String id;
    @Column(name = "full_name")
    private String fullname;
    @Column
    private String dob;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String address;
    @Column
    private EmpStatus status;

    public EmpStatus getStatus() {
        return status;
    }

    public String getFullname() {
        return fullname;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setStatus(EmpStatus status) {
        this.status = status;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee(String id, String fullname, String dob, String email, String phone, String address, EmpStatus status) {
        this.id = id;
        this.fullname = fullname;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }
}
