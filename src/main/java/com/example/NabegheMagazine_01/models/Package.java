package com.example.NabegheMagazine_01.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "package")
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String imagePath;
}
