package com.example.NabegheMagazine_01.services;

import com.example.NabegheMagazine_01.models.ContactUs;
import com.example.NabegheMagazine_01.repositories.ContactUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsService {
    @Autowired
    private ContactUsRepository contactUsRepository;

    public void createContactUs(ContactUs contactUs) {
        contactUsRepository.save(contactUs);
    }
}
