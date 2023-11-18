package com.iuh.edu.vn.week4.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Candidate {
    @Id
    @Column
    private long id;

    @Column
    private String fullName;

    @Column
    @DateTimeFormat
    private LocalDate dod;

    @Column
    private String phone;

    @Column
    private String email;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;


    @OneToMany
    @JoinColumn(name = "candidate_skill")
    private List<CandidateSkill> candidateSkills;


    @OneToMany
    @JoinColumn(name = "experiences")
    private List<Experience> experiences;
}
