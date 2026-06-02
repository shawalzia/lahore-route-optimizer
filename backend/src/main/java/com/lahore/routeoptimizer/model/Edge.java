package com.lahore.routeoptimizer.model;

public class Edge {
    public int destination;
    public double weight;

    public Edge(int destination, double weight) {
        this.destination = destination;
        this.weight = weight;
    }
}
