package com.nix.h1totsu.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User extends AbstractDocument {
    private String login;
    private String firstName;
    private String lastName;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
