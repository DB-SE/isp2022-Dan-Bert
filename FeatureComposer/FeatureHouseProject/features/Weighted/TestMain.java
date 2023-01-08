import java.util.ArrayList;

/**
 * TODO description
 */
public class TestMain {
	
public void ChangeGraph(Graph g) {
		
		// original(); führt zu fehler?
		
		ArrayList<Edge> edges = g.edges;
		edges.get(0).changeWeight(2);
		edges.get(1).changeWeight(5);
		edges.get(2).changeWeight(5);
		edges.get(3).changeWeight(1);
		edges.get(4).changeWeight(1);
		
	}

}