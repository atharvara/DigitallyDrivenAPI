package com.example.user.Service;

import com.example.user.Repository.ServicesRepository;
import com.example.user.model.Services;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.*;

@Service
public class ServicesService {

    @Autowired
    private ServicesRepository servicesRepository;

    public Services addServices(Services services) {
        return servicesRepository.save(services);
    }
}
