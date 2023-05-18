import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectedGraphMatrixTest {

    private DirectedGraphMatrix<String, Integer> graph;

    @Before
    public void setUp() {
        // Initialize the DirectedGraphMatrix object before each test
        graph = new DirectedGraphMatrix<>(5);
    }

    @Test
    public void testAdd() {
        // Test case for adding vertices
        graph.add("A");
        graph.add("B");
        graph.add("C");

        Assert.assertTrue(graph.contains("A"));
        Assert.assertTrue(graph.contains("B"));
        Assert.assertTrue(graph.contains("C"));
    }

    @Test
    public void testAddDuplicate() {
        // Test case for adding duplicate vertices
        graph.add("A");
        graph.add("B");
        graph.add("C");

        graph.add("A");

        // Add your assertions here based on the expected behavior
    }

    @Test
    public void testAddEdge() {
        // Test case for adding edges
        graph.add("A");
        graph.add("B");
        graph.add("C");

        graph.addEdge("A", "B", 10);
        graph.addEdge("B", "C", 20);

        // Add your assertions here based on the expected behavior
    }

    @Test
    public void testAddEdgeWithMissingVertices() {
        // Test case for adding an edge with missing vertices
        graph.addEdge("A", "B", 10);

        // Add your assertions here based on the expected behavior
    }

    @Test
    public void testContains() {
        // Test case for checking vertex existence
        graph.add("A");
        graph.add("B");

        Assert.assertTrue(graph.contains("A"));
        Assert.assertTrue(graph.contains("B"));
        Assert.assertFalse(graph.contains("C"));
    }

    @Test
    public void testPrintAdjacencyMatrix() {
        // Test case for printing the adjacency matrix
        graph.add("A");
        graph.add("B");
        graph.add("C");

        graph.addEdge("A", "B", 10);
        graph.addEdge("B", "C", 20);

        graph.printAdjacencyMatrix(); // Assuming this method prints the matrix to the console

        // Add your assertions here based on the expected behavior
    }
}
