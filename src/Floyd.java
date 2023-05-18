import java.util.Hashtable;
import java.util.Map.Entry;

public class Floyd<V, E> {
	DirectedGraphMatrix<V, E> graph;
	Object[][] next;
	public Floyd(DirectedGraphMatrix<V, E> graph, V origin, V destination) {
		this.graph = graph;
		if(graph.contains(origin) == false && graph.contains(origin) == false ) {
			System.out.println("No existen los vértices");
			
		}
		
		else {
			calculate(origin, destination);
		}
	}
	
	
	
	
	private void calculate(V origin, V destination) {
		Object[][] matrix = graph.getMatrix();
		Object[][] next = new Object[graph.getSize()][graph.getSize()];
		Integer index1 = searchIndex(origin);
		Integer index2 = searchIndex(destination);
		//Iniciar next
		
		for (int i = 1; i < graph.getSize(); i++) {
	        for (int j = 1; j < graph.getSize(); j++) {
	
	            next[i][j] = (i == j || (Integer)matrix[i][j] == Integer.MAX_VALUE) ? null : j;

	        }
	    }
		
		for (int k = 1; k < graph.getSize(); k++) {
	       for (int i=1; i<graph.getSize();i++) {
	    	   for (int j=0; j<graph.getSize();j++) {
	    		   Integer altDist = (Integer)matrix[i][j] +(Integer)matrix[k][j];
	    		   next[i][j] =next[i][k];
	    	   }
	       }
	    }
		System.out.println("El camino es: ");
		System.out.println(origin);
		Integer intermedio = (Integer)next[index1][index2];
		System.out.println(getKey(intermedio));
		System.out.println(destination);
		
		
		
		
		
	}
	
	private Integer searchIndex(V label) {
		Hashtable<V,Vertex<V>> map = (Hashtable<V, Vertex<V>>) graph.getDict();
		Vertex<V> vertex = map.get(label);
		return vertex.getRow();
	}
	
	private V getKey(Integer value) {
		V key = null;
		Hashtable<V,Vertex<V>> hashtable = (Hashtable<V, Vertex<V>>) graph.getDict();
		for (Entry<V, Vertex<V>> entry : hashtable.entrySet()) {
            if (value.equals(entry.getValue())) {
                key = entry.getKey();
            }
		
		}
		return key;
	}
	
}
 