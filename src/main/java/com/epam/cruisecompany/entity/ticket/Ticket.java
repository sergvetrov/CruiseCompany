package com.epam.cruisecompany.entity.ticket;

import com.epam.cruisecompany.entity.Cruise;
import com.epam.cruisecompany.entity.person.User;

public class Ticket {

    private int id;
    private double price;
    private Status status;
    private User user;
    private Cruise cruise;

    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
