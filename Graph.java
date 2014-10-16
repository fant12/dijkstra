package dijkstra;

import java.util.List;

/**
 *
 * @author mknolle
 * @param <K>
 * @param <V>
 */
public class Graph<K, V> {

    final private List<Vertex<K, V>> _VERTICES;
    final private List<Edge> _EDGES;
    
    public Graph(List<Vertex<K, V>> vertices, List<Edge> edges){
        _VERTICES = vertices;
        _EDGES = edges;
    }
    
    public List<Vertex<K, V>> getVertices(){
        return _VERTICES;
    }
    
    public List<Edge> getEdges(){
        return _EDGES;
    }
}