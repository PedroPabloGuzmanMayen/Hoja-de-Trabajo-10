
public class Vertex<V> {
	V label;
	Integer row;
	public Vertex(V label, Integer row) {
		this.label = label;
		this.row = row;
	}
	
	public V label() {
		return this.label;
	}
	public boolean equals(Object value) {
		if(this.label == value) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public Integer getRow() {
		return this.row;
	}

}
