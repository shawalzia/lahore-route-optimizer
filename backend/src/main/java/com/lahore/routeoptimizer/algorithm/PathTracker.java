package com.lahore.routeoptimizer.algorithm;

import com.lahore.routeoptimizer.graph.Graph;
import com.lahore.routeoptimizer.model.RouteResponse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathTracker {

    public static RouteResponse reconstruct(Graph graph, int source, int destination, double[] dist) {
        if (dist[destination] == Double.MAX_VALUE) {
            return new RouteResponse(new ArrayList<>(), -1, false, "No path found between these locations.");
        }

        LinkedList<String> path = new LinkedList<>();
        int current = destination;

        while (current != -1) {
            path.addFirst(graph.getLocation(current).getName());
            current = Dijkstra.lastPrevious[current];
        }

        return new RouteResponse(
            new ArrayList<>(path),
            Math.round(dist[destination] * 10.0) / 10.0,
            true,
            "Route found successfully!"
        );
    }
}
