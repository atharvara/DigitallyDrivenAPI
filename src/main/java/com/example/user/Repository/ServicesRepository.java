package com.example.user.Repository;

import com.example.user.Service.ServicesService;
import com.example.user.model.Services;
import com.example.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.security.Provider;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long> {
    // add any custom methods here, if needed
}
