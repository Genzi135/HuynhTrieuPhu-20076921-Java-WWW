package com.iuh.edu.vn.week4.models;

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
public class Job {
    @Id
    @Column
    private long id;

    @JoinColumn
    @ManyToOne
    private Company company;

    @Column(name = "job_desc", length = 2000)
    private String desc;

    @Column(name = "job_name", length = 255)
    private String name;
}
