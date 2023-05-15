package com.example.NabegheMagazine_01.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contact_us")
public class ContactUs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "body")
    private String body;
}
