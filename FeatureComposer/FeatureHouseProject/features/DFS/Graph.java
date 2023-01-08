/**
 * TODO description
 */
import java.util.ArrayList;
import java.util.Stack;

public class Graph {
	
	public void TestGraph() {
		original();
		printDFS(this);
	}
	
	
	public void printDFS(Graph g) {
		Stack<Node<?>> toVisit = new Stack<Node<?>>();
		ArrayList<Node<?>> marked = new ArrayList<Node<?>>();
		ArrayList<Node<?>> output = new ArrayList<Node<?>>();
		
		if(!g.nodes.isEmpty()) {
			toVisit.add(g.nodes.get(0));
			marked.add(g.nodes.get(0));
			
			while(!toVisit.isEmpty()) {
				Node<?> tmp = toVisit.pop();
				output.add(tmp);
				for(Node<?> n: g.searchNeighbors(tmp, g.edges)) {
					if(!marked.contains(n)) {
						toVisit.add(n);
						marked.add(n);
					}
				}
			}
		}
		System.out.println("DFS: " + output);

	}

}