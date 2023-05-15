package com.example.NabegheMagazine_01.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Column(name = "is_superuser")
    private boolean isSuperUser;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "is_staff")
    private boolean isStaff;

    @Column(name = "is_active")
    private boolean isActive;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "date_join")
    private LocalDateTime dateJoin;

    @Column(name = "address")
    private String address;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "biography")
    private String biography;

    @Column(name = "credit")
    private int credit = 0;

    @Column(name = "purchased_magazine")
    private ArrayList<Integer> purchasedMagazine;

    @Column(name = "point")
    private int point = 0;

    @Column(name = "profile_picture")
    private String profilePicture;
}
