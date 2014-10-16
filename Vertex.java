package dijkstra;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author mknolle
 * @param <K>
 * @param <V>
 */
public class Vertex<K, V> {

    private ArrayList<Edge> _edges;
    private K _key;
    private V _value;
    
    public Vertex(){
        this(null, null);
    }
    
    public Vertex(K key, V value){
        this(key, value, 1);
    }
    
    public Vertex(K key, V value, int connections){
        _edges = new ArrayList<>();
        _key = key;
        _value = value;
    }

    public void setKey(K key){
        _key = key;
    }
    
    public void setValue(V value){
        _value = value;
    }
    
    public K getKey(){
        return _key;
    }
    
    public V getValue(){
        return _value;
    }
    
    public void addEdge(Edge e){
        _edges.add(e);
    }
    
    public void removeEdge(Edge e){
        _edges.remove(e);
    }
    
    public Edge[] getEdges(){
        return (Edge[])_edges.toArray();
    }
    
    @Override
    public boolean equals(Object o){
        
        if(null == o) return false;
        if(this == o) return true;
        if(getClass() == o.getClass()){
            Vertex<K, V> v = (Vertex<K, V>) o;
            return v.getKey().equals(_key);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (29 * 7 + Objects.hashCode(this._key));
    }
    
    public Vertex[] nextNodes(){
        if(!_edges.isEmpty()){
            Vertex[] vertices = new Vertex[_edges.size()];
            for(int i = 0; vertices.length > i; ++i)
                vertices[i] = _edges.get(i).getStart();
            return vertices;
        }
        return null;
    }
    
    public Vertex[] prevNodes(){
        if(!_edges.isEmpty()){
            Vertex[] vertices = new Vertex[_edges.size()];
            for(int i = 0; vertices.length > i; ++i)
                vertices[i] = _edges.get(i).getEnd();
            return vertices;
        }
        return null;
    }
}