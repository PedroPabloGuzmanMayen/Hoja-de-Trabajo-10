import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class DirectedGraphMatrix<V, E> extends AbstractGraphMatrix<V, E> {
 
	
	public DirectedGraphMatrix(int size) {
		super(size, true);
	}
	
	public void add(V label) {
		if(dict.containsKey(label) || freeList.isEmpty() == true) {
			return;
		}
		else {
			Integer index = freeList.get(0);
			freeList.remove(0);
			dict.put(label, new Vertex<V>(label, index));
		}
	}
	
	public void addEdge(V label1, V label2, E label) {
		if (this.contains(label1) == false && this.contains(label2) == false) {
			throw new IllegalArgumentException("Both " + label1.toString() + " and " + label2.toString() + " do not exist in the graph.");
		}
		else {
			Edge<V, E> edge = new Edge<V, E>(label1, label2, label, true);
			edges.add(edge);
			Vertex<V> vrtx1, vrtx2;
			vrtx1 = dict.get(label1);
			vrtx2 = dict.get(label2);
			data[vrtx1.getRow()][vrtx2.getRow()] = edge.getLabel();
		}
	
	}
	
	public boolean contains(V label) {
		if (dict.containsKey(label)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
