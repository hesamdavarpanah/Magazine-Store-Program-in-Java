package com.example.NabegheMagazine_01.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "magazine_page")
public class MagazinePage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "page_number", unique = true, nullable = false)
    private int pageNumber;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "magazine_id")
    private Magazine magazine;
}
