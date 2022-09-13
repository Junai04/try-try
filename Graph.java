
package Graph;

/**
 *
 * @author Jun
 */
public class Graph {
    private int[][] adjMatrix;
    private char[] vertexList;
    private int maxVertex = 10;
    private int countVertex = 0;

    public Graph() {
        vertexList = new char[maxVertex];
        adjMatrix = new int[maxVertex][maxVertex];
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                if (i == j) {
                    adjMatrix[i][j] = 0;
                } else {
                    adjMatrix[i][j] = -1;
                }
            }
        }
    }

    public void addVertex(char node) {
        vertexList[countVertex++] = node;
    }

    public void addEdge(int a, int b, int c) {
        adjMatrix[a][b] = c;
        adjMatrix[b][a] = c;
        
    }
    
    public void addEdge(char a, char b, int c){ 
        adjMatrix[indexVertex(a)][indexVertex(b)] = c;
        adjMatrix[indexVertex(b)][indexVertex(a)] = c;

    }

    private int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i] == label) {
                return i;
            }
        }
        return -1;
    }

    public void printAdjMatrix() {
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                System.out.print(adjMatrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Graph{" + "maxVertex=" + maxVertex + ", vertexList=" + vertexList
                + ", adjacencyMatrix=" + adjMatrix + ", countVertex="
                + countVertex + '}';
    }
}

