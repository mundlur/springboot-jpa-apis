package com.oracle.dbcs.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Random;
import java.util.UUID;

@Entity

@Table(name = "CUSTOMERS")

public class Customer {

    @Id
    private String id;

    @JsonProperty
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @JsonProperty
    private String email;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @PrePersist
    private void generateId() {
        if (this.id == null)
            this.id = UUID.randomUUID().toString();
    }
}
