package com.iuh.edu.vn.week4.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Experience {
    @Id
    @Column(name = "experience_id")
    private long id;


    @ManyToOne
    @JoinColumn
    private Candidate candidate;

    @Column
    @Temporal(TemporalType.DATE)
    private LocalDate toDate;

    @Column
    @Temporal(TemporalType.DATE)
    private LocalDate fromDate;

    @Column(length = 120)
    private String company;

    @Column(length = 100)
    private String role;

    @Column(length = 400)
    private String workDescription;
}
