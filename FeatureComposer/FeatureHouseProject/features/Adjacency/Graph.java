/**
 * TODO description
 */
import java.util.ArrayList;

public class Graph {

	public void TestGraph() {
		original();
		printAdj(this);
	}
	
	
	public void printAdj(Graph g) {
		ArrayList<ArrayList<Integer>> adjacencyMatrix = new ArrayList<ArrayList<Integer>>();
		
		for (Node<?> nodeA: g.nodes) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (Node<?> nodeB: g.nodes) {
				// doofe Implementierung aber es funktioniert
				int connected = 0; // 0 stands for false
				for(Edge e: g.edges) {
					if(e.contains(nodeA, nodeB)) {
						connected = 1;
						break;
					}
				}
				row.add(connected);
			}
			adjacencyMatrix.add(row);
		}
		
		// print matrix
		System.out.println("Adjacency Matrix: ");
		System.out.println("N: " + "\t" + g.nodes);
		for (int i = 0; i < g.nodes.size(); i++) {
			System.out.println(g.nodes.get(i) + ": " + "\t" + adjacencyMatrix.get(i));
		}

	}

}