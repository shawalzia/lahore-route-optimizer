package com.lahore.routeoptimizer.algorithm;

public class NodeEntry implements Comparable<NodeEntry> {
    public int locationId;
    public double distance;

    public NodeEntry(int locationId, double distance) {
        this.locationId = locationId;
        this.distance = distance;
    }

    @Override
    public int compareTo(NodeEntry other) {
        return Double.compare(this.distance, other.distance);
    }
}
