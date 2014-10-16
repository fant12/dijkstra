package dijkstra;

/**
 *
 * @author mknolle
 */
public class Edge {

    private float _weight;
    private Vertex _start;
    private Vertex _end;
    
    public Edge(){
        this(null, null, 0);
    }
    
    public Edge(Vertex start, Vertex end){
        this(start, end, 0);
    }
    
    public Edge(Vertex start, Vertex end, float weight){
        _start = start;
        _end = end;
        _weight = weight;
    }
    
    public void setStart(Vertex start){
        _start = start;
    }
    
    public void setEnd(Vertex end){
        _end = end;
    }
    
    public void setWeight(float weight){
        _weight = weight;
    }
    
    public Vertex getStart(){
        return _start;
    }
    
    public Vertex getEnd(){
        return _end;
    }
    
    public float getWeight(){
        return _weight;
    }
}