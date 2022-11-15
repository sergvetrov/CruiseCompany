package com.epam.cruisecompany.entity.person;

import com.epam.cruisecompany.entity.ticket.Ticket;

import java.util.List;

public class User extends Person{
    private String email;
    private String password;
    private Role role;
    private int wallet;
    private boolean hasDocument;

    public User() {
    }

    public User(int idUser, String name, String surname, String email, String password, Role role) {
        super(idUser, name, surname);
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public boolean isHasDocument() {
        return hasDocument;
    }

    public void setHasDocument(boolean hasDocument) {
        this.hasDocument = hasDocument;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
