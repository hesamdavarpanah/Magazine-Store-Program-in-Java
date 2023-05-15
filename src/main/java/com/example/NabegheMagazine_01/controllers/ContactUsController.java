package com.example.NabegheMagazine_01.controllers;

import com.example.NabegheMagazine_01.models.ContactUs;
import com.example.NabegheMagazine_01.services.ContactUsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact-us")
public class ContactUsController {
    ContactUsService contactUsService;

    @PostMapping("/message")
    public ResponseEntity<String> contactUsMessage(@RequestBody ContactUs contactUs) {
        contactUsService.createContactUs(contactUs);
        return new ResponseEntity<>("The message created", HttpStatus.CREATED);
    }
}
