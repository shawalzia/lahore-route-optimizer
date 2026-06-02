package com.lahore.routeoptimizer.algorithm;

import com.lahore.routeoptimizer.graph.Graph;
import com.lahore.routeoptimizer.model.Edge;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {

    public static int[] lastPrevious;

    public static double[] findShortestPaths(Graph graph, int source) {
        int n = graph.getNumLocations();
        double[] dist = new double[n];
        int[] previous = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Double.MAX_VALUE);
        Arrays.fill(previous, -1);
        dist[source] = 0;

        PriorityQueue<NodeEntry> pq = new PriorityQueue<>();
        pq.offer(new NodeEntry(source, 0));

        while (!pq.isEmpty()) {
            NodeEntry current = pq.poll();
            int u = current.locationId;

            if (visited[u]) continue;
            visited[u] = true;

            for (Edge edge : graph.getNeighbors(u)) {
                int v = edge.destination;
                double newDist = dist[u] + edge.weight;

                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    previous[v] = u;
                    pq.offer(new NodeEntry(v, newDist));
                }
            }
        }

        lastPrevious = previous;
        return dist;
    }
}
