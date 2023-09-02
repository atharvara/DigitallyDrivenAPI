package com.example.user.Service;

import com.example.user.Repository.ContactRepository;
import com.example.user.Repository.ServicesRepository;
import com.example.user.model.Contact;
import com.example.user.model.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
