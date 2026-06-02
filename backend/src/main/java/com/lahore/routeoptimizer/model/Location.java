package com.lahore.routeoptimizer.model;

public class Location {
    public int id;
    public String name;

    public Location(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}
