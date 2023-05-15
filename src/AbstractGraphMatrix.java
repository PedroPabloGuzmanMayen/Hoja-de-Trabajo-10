import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class AbstractGraphMatrix<V, E> implements IGraph<V, E> {

	protected int size; 
	protected Object data[][]; 
	protected Map<V,Vertex<V>> dict; 
	protected ArrayList<Integer> freeList; 
	protected boolean directed; 
	protected ArrayList<Edge<V, E>> edges;
	protected AbstractGraphMatrix(int size, boolean dir){
	this.size = size; 
	directed = dir; 
	data = new Object[size][size];
	dict = new Hashtable<V,Vertex<V>>(size);
	freeList = new ArrayList<Integer>();
	for (Integer i = 0; i<size+1; i++) {
		freeList.add(i);
	}
	edges = new ArrayList<Edge<V, E>> ();
	}
	@Override
	public void add(V label) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addEdge(V vertex1, V vertex2, E label) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public V remove(V label) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public V get(V label) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Edge<V, E> getEdge() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean contains(V label) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsEdge(V label1, V label2) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isDirected() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void traverse(V label) {
		// TODO Auto-generated method stub
		
	}
	



}
