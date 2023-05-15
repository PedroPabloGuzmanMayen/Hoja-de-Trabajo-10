import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GraphBuilder {
    
    public static void buildGraphFromFile(DirectedGraphMatrix<String, Integer> graph) {
        try {
            Scanner scanner = new Scanner(new File("logistica.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String vertex1 = parts[0];
                String vertex2 = parts[1];
 
                graph.add(vertex1);
                graph.add(vertex2);
                System.out.println("¿Que condiciones hay en la ruta de " + vertex1 + " a " + vertex2 + "?");
                System.out.println("1. Condiciones normales");
                System.out.println("2. Lluvia");
                System.out.println("3. Nieve");
                System.out.println("4. Tormenta");
                System.out.println("5. Trafico");
                
                Scanner s = new Scanner(System.in);
                System.out.println("Ingresa tu respuesta: ");
                Integer answer = s.nextInt();
                s.nextLine();
                
                switch(answer) {
                	case 1:
                		graph.addEdge(vertex1, vertex2, Integer.parseInt(parts[2]));
                		break;
                	case 2:
                		graph.addEdge(vertex1, vertex2, Integer.parseInt(parts[3]));
                		break;
                		
                	case 3:
                		graph.addEdge(vertex1, vertex2, Integer.parseInt(parts[4]));
                		break;
                	case 4:
                		graph.addEdge(vertex1, vertex2, Integer.parseInt(parts[5]));
                		break;
                	case 5:
                		graph.addEdge(vertex1, vertex2, Integer.MAX_VALUE);
                		break;
                		
                	default:
                		throw new IllegalArgumentException("Valor invalido");
                }
                
  
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
