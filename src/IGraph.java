
public interface IGraph<V, E> {
	/**
	 * Agrega un vertice al grafo
	 * @param label la etiqueta que tiene 
	 * @pre label no es nulo
	 * @post Agrega un grafo que tiene a label como etiqueta
	 */
	public void add(V label);
	/**
	 * Agrega una arista al grafo
	 * @param vertex1
	 * @param vertex2
	 * @param label
	 */
	public void addEdge(V vertex1, V vertex2, E label);
	/**
	 * Elimina un vértice
	 * @param label la etiqueta del vértice a eliminar
	 * @return el valor del vértice eliminado
	 */
	public V remove(V label);
	/**
	 * Obtiene el valor de un vértice
	 * @param label la etiqueta del vértice que se quiere encontrar
	 * @return el valor del vértice deseado
	 */
	public V get(V label);
	/**
	 * Encuentra una arista
	 * @return los valores de la arista
	 */
	public Edge<V, E> getEdge();
	/**
	 * Verifica si existe un vértice
	 * @param label la etiqueta del vértice del cuál se quiere verificar su existencia
	 * @return un booleano el cuál indica si el vértice existe.
	 */
	public boolean contains(V label);
	/**
	 * Verifica si existe una arista
	 * @param label1 primer vértice de la arista
	 * @param label2 segundo vértice de la arista
	 * @return true si la arista existe, false si no.
	 */
	public boolean containsEdge(V label1, V label2);
	/**
	 * Indica el número de vértices
	 * @return el número de vértices del grafo
	 */
	public int size();
	/**
	 * Indica si el vértice tiene dirección
	 * @return true si es un grafo con dirección, false si no lo es
	 */
	public boolean isDirected();
	/**
	 * Recorre el grafo desde un vértice indicado
	 * @param label la etiqueta del vértice desde donde se quiere reocrrer el grafo
	 */
	public void traverse(V label);
	
	
}
