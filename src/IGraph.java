
public interface IGraph {
	
	<T> void addVertex(Vertex<T> v);
	<T>void addEdge(T value, Edge<T> e);
	void vertexNumber();
	<T> void deleteVertex(Vertex<T> v);
	<T> void deleteEdge(Edge<T> e);
	<T> void Traverse(T value);
	<T> void searchVertex(T value);

}
