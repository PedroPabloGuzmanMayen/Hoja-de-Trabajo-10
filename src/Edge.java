
public class Edge<V, E> {
	private E label;
	private V ver1;
	private V ver2;
	private boolean isDirected;
	public Edge(V ver1, V ver2, E label, boolean isDirected) {
		this.ver1 = ver1;
		this.ver2 = ver2;
		this.label = label;
		this.isDirected = isDirected;
	}
	
	public V here() {
		return this.ver1;
		
	}
	
	public V there() {
		return this.ver2;
	}
	
	public void setLabel(E label) {
		this.label = label;
	}
	
	public boolean directed() {
		return this.isDirected;
	}
	public E getLabel() {
		return this.label;
	}
	
}
