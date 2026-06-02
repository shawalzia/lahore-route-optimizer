package com.lahore.routeoptimizer.controller;

import com.lahore.routeoptimizer.algorithm.Dijkstra;
import com.lahore.routeoptimizer.algorithm.PathTracker;
import com.lahore.routeoptimizer.graph.Graph;
import com.lahore.routeoptimizer.graph.LahoreMap;
import com.lahore.routeoptimizer.model.Location;
import com.lahore.routeoptimizer.model.RouteResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")   // allows frontend on any port to call this
public class RouteController {

    private final Graph graph = LahoreMap.buildMap();

    // GET /api/locations  → returns all location names + ids
    @GetMapping("/locations")
    public List<Location> getLocations() {
        return graph.getAllLocations();
    }

    // GET /api/route?src=0&dest=3  → returns shortest path
    @GetMapping("/route")
    public RouteResponse getRoute(
            @RequestParam int src,
            @RequestParam int dest) {

        if (src < 0 || src >= graph.getNumLocations() ||
            dest < 0 || dest >= graph.getNumLocations()) {
            return new RouteResponse(null, -1, false, "Invalid location IDs.");
        }

        if (src == dest) {
            return new RouteResponse(
                List.of(graph.getLocation(src).getName()),
                0, true, "Already at destination!"
            );
        }

        double[] dist = Dijkstra.findShortestPaths(graph, src);
        return PathTracker.reconstruct(graph, src, dest, dist);
    }
}
