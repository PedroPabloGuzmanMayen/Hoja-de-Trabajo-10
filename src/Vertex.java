
public class Vertex<T> {
	T value;
	Edge nextEdge;
	
	public Vertex(T value) {
		
	}
	public Vertex(T value, Edge<T> edge) {
		
	}
	
	public void createEdge(Edge<T> edge) {
		this.nextEdge = edge;
	}
	
	public Edge<T> getnextEdge(){
		return this.nextEdge;
	}
}
