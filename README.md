# Lahore Route Optimizer

A full-stack DSA project that finds the shortest path between Lahore landmarks using **Dijkstra's Algorithm**.

##  Tech Stack
- **Backend**: Java 17 + Spring Boot 3 (REST API)
- **Frontend**: HTML + CSS + Vanilla JS (pastel UI)
- **Algorithm**: Dijkstra's with Min-Heap (PriorityQueue)

##  How to Run

### Backend
```bash
cd backend
mvn spring-boot:run
```
Runs on `http://localhost:8080`

### Frontend
Just open `frontend/index.html` in your browser.
(Or use Live Server in VS Code)

##  API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/locations` | All Lahore landmarks |
| GET | `/api/route?src=0&dest=3` | Shortest path between two locations |

##  Complexity
- Time: `O((V + E) log V)` — V=nodes, E=edges
- Space: `O(V)` for dist[] and previous[] arrays

##  Project Structure
```
route-optimizer/
├── backend/
│   ├── src/main/java/com/lahore/routeoptimizer/
│   │   ├── model/          Location, Edge, RouteResponse
│   │   ├── graph/          Graph, LahoreMap
│   │   ├── algorithm/      Dijkstra, NodeEntry, PathTracker
│   │   └── controller/     RouteController (REST API)
│   └── pom.xml
└── frontend/
    └── index.html
```
