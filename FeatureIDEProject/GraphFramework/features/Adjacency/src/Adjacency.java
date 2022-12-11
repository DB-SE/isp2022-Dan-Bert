import java.util.ArrayList;


import interfaces.IAlgorithms;
import main.BaseEdge;
import main.BaseNode;
import main.Graph;

public class Adjacency implements IAlgorithms {

	@Override
	public void printResult(Graph g) {
		ArrayList<ArrayList<Integer>> adjacencyMatrix = 
				new ArrayList<>();
		
		for (BaseNode<?> nodeA: g.nodes) {
			ArrayList<Integer> row = new ArrayList<>();
			for (BaseNode<?> nodeB: g.nodes) {
				// doofe Implementierung aber es funktioniert
				int connected = 0; // 0 stands for false
				for(BaseEdge e: g.edges) {
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
