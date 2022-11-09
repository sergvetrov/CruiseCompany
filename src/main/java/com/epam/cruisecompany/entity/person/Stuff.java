package com.epam.cruisecompany.entity.person;

import com.epam.cruisecompany.entity.Cruise;

public class Stuff extends Person{

    private String position;
    private Cruise cruise;

    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
