package com.example.NabegheMagazine_01.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "magazine")
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "publish_date")
    private LocalDateTime publishDate;

    @Column(name = "price")
    private int price;

    @Column(name = "magazine_pdf_file")
    private String magazinePDFFile;

    @Column(name = "cover_image")
    private String imagePath;
}
