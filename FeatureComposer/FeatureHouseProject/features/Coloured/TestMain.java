import java.util.ArrayList;

/**
 * TODO description
 */
public class TestMain {

public void ChangeGraph(Graph g) {
		
		// original(); führt zu fehler?
		
		ArrayList<Node<?>> nodes = g.nodes;
		
		for (Node<?> node : nodes) {
			node.setColor("Green");
		}
	}
}