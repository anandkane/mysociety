package com.example.mysociety.building.model;

public class Building {
    private String name;

    public Building() {
    }

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Building{").append("name='").append(name).append('\'').append('}').toString();
    }
}
