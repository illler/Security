package com.illler.security.controllers;


import com.illler.security.model.Contact;
import com.illler.security.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
@RequiredArgsConstructor
public class ContactController {

    private final ContactRepository contactRepository;

    @PostMapping("/contact")
    public Contact saveContactDet(@RequestBody Contact contact){
        contact.setContactId(getServiceReqNum());
        contact.setCreateDt(new Date(System.currentTimeMillis()));
        return contactRepository.save(contact);
    }

    public String getServiceReqNum(){
        Random random = new Random();
        int randNum = random.nextInt(999999999-9999)+9999;
        return "SR" + randNum;
    }
}
