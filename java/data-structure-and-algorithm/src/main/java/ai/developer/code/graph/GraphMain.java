package ai.developer.code.graph;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GraphMain {
    public static void main(String[] args) {

            Graph graph = new Graph();
            graph.addVertex("Bob");
            graph.addVertex("Alice");
            graph.addVertex("Mark");
            graph.addVertex("Rob");
            graph.addVertex("Maria");
            graph.addVertex("Zak");

            graph.addEdge("Bob", "Alice");
            graph.addEdge("Bob", "Rob");
            graph.addEdge("Alice", "Mark");
            graph.addEdge("Rob", "Mark");
            graph.addEdge("Alice", "Maria");
            graph.addEdge("Rob", "Maria");
            graph.addEdge("Maria", "Zak");


            List<Vertex> bob = graph.getAdjVertices("Rob");

            LinkedHashSet<String > str1 =  graph.depthFirstTraversal("Maria");

            System.out.println(str1);

            LinkedHashSet<String > str2 =  graph.breadthFirstTraversal("Maria");

            System.out.println(str2);

    }
}
