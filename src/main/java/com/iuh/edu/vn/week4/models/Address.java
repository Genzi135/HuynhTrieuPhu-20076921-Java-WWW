package com.iuh.edu.vn.week4.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class Address {
    @Id
    @Column(name = "add_id")
    private long id;

    @Column
    private CountryCode country;

    @Column(length = 7)
    private String zipcode;

    @Column(length = 20)
    private String number;

    @Column(length = 50)
    private String city;

    @Column(length = 150)
    private String street;

}
