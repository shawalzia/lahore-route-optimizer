package com.lahore.routeoptimizer.graph;

import com.lahore.routeoptimizer.model.Edge;
import com.lahore.routeoptimizer.model.Location;

import java.util.*;

public class Graph {
    private int numLocations;
    private List<Location> locations;
    private Map<Integer, List<Edge>> adjacencyList;

    public Graph(int numLocations) {
        this.numLocations = numLocations;
        this.locations = new ArrayList<>();
        this.adjacencyList = new HashMap<>();
        for (int i = 0; i < numLocations; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }
    }

    public void addLocation(Location loc) {
        locations.add(loc);
    }

    public void addEdge(int src, int dest, double weight) {
        adjacencyList.get(src).add(new Edge(dest, weight));
        adjacencyList.get(dest).add(new Edge(src, weight));
    }

    public List<Edge> getNeighbors(int locationId) {
        return adjacencyList.getOrDefault(locationId, new ArrayList<>());
    }

    public Location getLocation(int id) {
        return locations.get(id);
    }

    public int getNumLocations() {
        return numLocations;
    }

    public List<Location> getAllLocations() {
        return locations;
    }
}
