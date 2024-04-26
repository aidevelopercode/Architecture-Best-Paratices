package ai.developer.code.graph;

import java.util.*;

public class Graph {

    /**
     * @see https://www.baeldung.com/java-graphs#:~:text=Graph%20Data%20Structure,e.g.%2C%20a%20person's%20friendships).
     */
    private Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();


    void addVertex(String name) {
        adjVertices.putIfAbsent(new Vertex(name), new ArrayList<>());
    }

    void removeVertex(String name) {
        Vertex v = new Vertex(name);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(name));
    }

    void addEdge(String name1, String name2) {
        Vertex v1 = new Vertex(name1);
        Vertex v2 = new Vertex(name2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    List<Vertex> getAdjVertices(String name) {
        return adjVertices.get(new Vertex(name));
    }

    public LinkedHashSet<String> depthFirstTraversal(String root) {

        LinkedHashSet<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<String>();

        stack.push(root);


        while(!stack.isEmpty()) {
            String vertex = stack.pop(); // pop  return and remove from queue because is visited
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : this.getAdjVertices(vertex)) {
                    stack.push(v.name);
                }
            }
        }

        return visited;
    }

    public LinkedHashSet<String> breadthFirstTraversal(String name) {

        LinkedHashSet<String> visited = new LinkedHashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(name);
        visited.add(name);
        while (!queue.isEmpty()) {
            String vertex = queue.poll(); // poll  return and remove from queue because is visited
            for (Vertex v : this.getAdjVertices(vertex)) {
                if (!visited.contains(v.name)) {
                    visited.add(v.name);
                    queue.add(v.name);
                }
            }
        }
        return visited;

    }
}
