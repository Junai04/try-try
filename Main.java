
package Graph;

/**
 *
 * @author Jun
 */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('H');
        graph.addVertex('W');
        graph.addVertex('C');
        graph.addVertex('D');
        
        graph.addEdge('A', 'H', 100);
        graph.addEdge('A', 'W', 800);
        graph.addEdge('A', 'C', -1);
        graph.addEdge('A', 'D', -1);
        graph.addEdge('H', 'W', 750);
        graph.addEdge('H', 'C', -1);
        graph.addEdge('H', 'D', -1);
        graph.addEdge('W', 'C', 400);
        graph.addEdge('W', 'D', -1);
        graph.addEdge('C', 'D', 750);
        graph.addEdge('D', 'C', 370);
        graph.printAdjMatrix();
    }
}

    

