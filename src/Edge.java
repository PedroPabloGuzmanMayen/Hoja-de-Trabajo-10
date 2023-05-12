
public class Edge<T> {
	 
	T value;
	Vertex<T> nextvertext;
	
	public Edge(T value, Vertex<T> vertex) {
		this.value = value;
		this.nextvertext = vertex;
	}
	public Vertex<T> nextVertex(){
			return nextvertext;
		}	
	}

