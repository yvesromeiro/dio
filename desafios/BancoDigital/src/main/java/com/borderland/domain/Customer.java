package com.borderland.domain;

import java.util.UUID;

public class Customer {
    private final UUID id;
    private String name;
    private String document;

    public Customer(String name, String document) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public UUID getId() {
        return id;
    }
}
