package com.lahore.routeoptimizer.graph;

import com.lahore.routeoptimizer.model.Location;

public class LahoreMap {

    public static Graph buildMap() {
        Graph graph = new Graph(10);

        graph.addLocation(new Location(0, "Gulberg"));
        graph.addLocation(new Location(1, "Liberty Market"));
        graph.addLocation(new Location(2, "Mall Road"));
        graph.addLocation(new Location(3, "Badshahi Mosque"));
        graph.addLocation(new Location(4, "Anarkali Bazaar"));
        graph.addLocation(new Location(5, "DHA Phase 5"));
        graph.addLocation(new Location(6, "Johar Town"));
        graph.addLocation(new Location(7, "Allama Iqbal Airport"));
        graph.addLocation(new Location(8, "Railway Station"));
        graph.addLocation(new Location(9, "Model Town"));

        graph.addEdge(0, 1, 1.5);
        graph.addEdge(1, 2, 2.1);
        graph.addEdge(2, 3, 1.8);
        graph.addEdge(3, 4, 0.9);
        graph.addEdge(4, 8, 1.2);
        graph.addEdge(2, 8, 2.4);
        graph.addEdge(0, 9, 3.0);
        graph.addEdge(9, 6, 2.5);
        graph.addEdge(6, 5, 4.1);
        graph.addEdge(5, 7, 6.2);
        graph.addEdge(0, 6, 5.0);
        graph.addEdge(1, 4, 3.3);
        graph.addEdge(7, 9, 8.5);

        return graph;
    }
}
