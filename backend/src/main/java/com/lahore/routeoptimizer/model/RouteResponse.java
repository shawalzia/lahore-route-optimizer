package com.lahore.routeoptimizer.model;

import java.util.List;

public class RouteResponse {
    private List<String> path;
    private double totalDistance;
    private boolean found;
    private String message;

    public RouteResponse(List<String> path, double totalDistance, boolean found, String message) {
        this.path = path;
        this.totalDistance = totalDistance;
        this.found = found;
        this.message = message;
    }

    public List<String> getPath() { return path; }
    public double getTotalDistance() { return totalDistance; }
    public boolean isFound() { return found; }
    public String getMessage() { return message; }
}
