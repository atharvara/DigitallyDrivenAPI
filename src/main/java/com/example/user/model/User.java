package com.example.user.model;

import jakarta.persistence.*;

@Entity
@Table(name = "REGIS", schema = "ATHARVA")
public class User {

        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGIS_ID_SEQ")
        @SequenceGenerator(name="REGIS_ID_SEQ", sequenceName="ATHARVA.REGIS_ID_SEQ", allocationSize=1)
        private Long id;

    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;
    public User() {
        this.name = "Unknown"; // set default value for name property
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
