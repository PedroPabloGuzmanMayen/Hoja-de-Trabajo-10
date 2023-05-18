

public class Main{
    public static void main(String[] args){
    	
    	GraphBuilder build = new GraphBuilder();
    
    	
    	DirectedGraphMatrix graph = new DirectedGraphMatrix<String, Integer>(4);
    	
    	build.buildGraphFromFile(graph);
    	
    	graph.fillMatrix();
    	
    	graph.printAdjacencyMatrix();
    	
    	Floyd<String, Integer> calculadora = new Floyd<String, Integer>(graph, "BuenosAires", "Quito");
    	
    	
    }


       
}
