package com.example.NabegheMagazine_01.repositories;

import com.example.NabegheMagazine_01.models.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, Long> {
}
