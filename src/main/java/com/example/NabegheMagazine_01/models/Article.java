package com.example.NabegheMagazine_01.models;

import jakarta.persistence.*;
import lombok.Data;

import java.net.URL;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "subject")
    private String subject;

    @Column(name = "body")
    private String body;

    @Column(name = "instagram_link")
    private String instagramLink;

    @Column(name = "telegram_link")
    private String telegramLink;

    @Column(name = "publish_date")
    private LocalDateTime publishDate;

    @Column(name = "image")
    private String imagePath;
}
