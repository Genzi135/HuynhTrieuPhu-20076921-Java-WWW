package com.iuh.edu.vn.week6.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "fisrtName", length = 50)
    private String firstName;

    @Column(name = "middleName", length = 50)
    private String middleName;

    @Column(name = "lasttName", length = 50)
    private String lastName;

    @Column(name = "mobile", length = 15)
    private String mobile;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password_hash", nullable = false, length = 32)
    private String password;

    @Column(name = "registerAt", nullable = false)
    private Instant registerAt;

    @Column(name = "LoginAt")
    private Instant loginAt;

    @Lob
    @Column(name = "intro")
    private String intro;

    @Lob
    @Column(name = "profile")
    private String profile;

    @OneToMany(mappedBy = "author")
    private Set<Post> posts =new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private  Set<PostComment> postComments= new LinkedHashSet<>();
}
