package com.iuh.edu.vn.week4.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    @Id

    @Column(name = "com_id")
    private long id;

    @PrimaryKeyJoinColumn
    @OneToOne
    private Address address;

    @Column(length = 2000)
    private String about;

    @Column(name = "comp_name", length = 255)
    private String name;

    @Column(length = 255)
    private String email;
    @Column(length = 255)
    private String phone;
    @Column(length = 255)
    private String web_url;
}
