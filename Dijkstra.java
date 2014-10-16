package dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author mknolle
 * @param <K>
 * @param <V>
 */
public class Dijkstra<K, V> {
    
    final private List<Vertex<K, V>> _vertices;
    final private List<Edge> _edges;
    private HashSet<Vertex<K, V>> _settledNodes;
    private HashSet<Vertex<K, V>> _unSettledNodes;
    private HashMap<Vertex<K, V>, Vertex> _predecessors;
    
    /**
     * Counts the walking distance.
     */
    private HashMap<Vertex<K, V>, Integer> _distance;
    
    public Dijkstra(Graph graph){
        _vertices = new ArrayList<>(graph.getVertices());
        _edges = new ArrayList<>(graph.getEdges());
    }
    
    public void running(Vertex<K, V> start){
        
        _settledNodes = new HashSet<>();
        _unSettledNodes = new HashSet<>();
        _distance = new HashMap<>();
        _predecessors = new HashMap<>();
        
        _distance.put(start, 0);
        _unSettledNodes.add(start);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Vertex> vertices = new ArrayList<>();
        vertices.add(new Vertex("A", null));
        vertices.add(new Vertex("B", null));
        vertices.add(new Vertex("C", null));
        vertices.add(new Vertex("D", null));
        vertices.add(new Vertex("E", null));
        vertices.add(new Vertex("F", null));
        vertices.add(new Vertex("G", null));
        
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(vertices.get(0), vertices.get(1), 5));
        edges.add(new Edge(vertices.get(0), vertices.get(1), 8));
        edges.add(new Edge(vertices.get(1), vertices.get(2), 2));
        edges.add(new Edge(vertices.get(1), vertices.get(3), 1));
        edges.add(new Edge(vertices.get(1), vertices.get(4), 6));
        edges.add(new Edge(vertices.get(2), vertices.get(4), 3));
        edges.add(new Edge(vertices.get(2), vertices.get(5), 3));
        edges.add(new Edge(vertices.get(3), vertices.get(6), 4));
        edges.add(new Edge(vertices.get(3), vertices.get(4), 3));
        edges.add( new Edge(vertices.get(4), vertices.get(6), 5));
        edges.add( new Edge(vertices.get(4), vertices.get(5), 2));
        edges.add( new Edge(vertices.get(5), vertices.get(6), 4));
        
        //a 
        vertices.get(0).addEdge(edges.get(0));
        vertices.get(0).addEdge(edges.get(1));
        
        //b
        vertices.get(1).addEdge(edges.get(0));
        vertices.get(1).addEdge(edges.get(2));
        vertices.get(1).addEdge(edges.get(3));
        vertices.get(1).addEdge(edges.get(4));
        
        //c
        vertices.get(2).addEdge(edges.get(1));
        vertices.get(2).addEdge(edges.get(2));
        vertices.get(2).addEdge(edges.get(5));
        vertices.get(2).addEdge(edges.get(6));
        
        //d
        vertices.get(3).addEdge(edges.get(3));
        vertices.get(3).addEdge(edges.get(7));
        vertices.get(3).addEdge(edges.get(8));
        
        //e
        vertices.get(4).addEdge(edges.get(4));
        vertices.get(4).addEdge(edges.get(5));
        vertices.get(4).addEdge(edges.get(8));
        vertices.get(4).addEdge(edges.get(9));
        vertices.get(4).addEdge(edges.get(10));
        
        //f
        vertices.get(5).addEdge(edges.get(6));
        vertices.get(5).addEdge(edges.get(11));
        vertices.get(5).addEdge(edges.get(12));
        
        Dijkstra dijk = new Dijkstra(new Graph(vertices, edges));
    }
    
}
