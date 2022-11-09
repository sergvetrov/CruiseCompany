package com.epam.cruisecompany.entity;

import com.epam.cruisecompany.entity.person.Stuff;
import com.epam.cruisecompany.entity.ticket.Ticket;

import java.util.Date;
import java.util.List;

public class Cruise {
    private int id;
    private String name;
    private List<Port> route;
    private Date start;
    private Date duration;
    private int passengersCapacity;
    private List<Stuff> stuff;
    private List<Ticket> tickets;

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public List<Stuff> getStuff() {
        return stuff;
    }

    public void setStuff(List<Stuff> stuff) {
        this.stuff = stuff;
    }

    public List<Port> getRoute() {
        return route;
    }

    public void setRoute(List<Port> route) {
        this.route = route;
    }
}
