/**
 * TODO description
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Graph {
	
	public void TestGraph() {
		original();
		printBFS(this);
	}
	
	
	public void printBFS(Graph g){
		Queue<Node<?>> toVisit = new LinkedList<Node<?>>();
		ArrayList<Node<?>> marked = new ArrayList<Node<?>>();
		ArrayList<Node<?>> output = new ArrayList<Node<?>>();
		
		if(!g.nodes.isEmpty()) {
			toVisit.add(g.nodes.get(0));
			marked.add(g.nodes.get(0));
			
			while(!toVisit.isEmpty()) {
				Node<?> tmp = toVisit.poll();
				output.add(tmp);
				for(Node<?> n: g.searchNeighbors(tmp, g.edges)) {
					if(!marked.contains(n)) {
						toVisit.add(n);
						marked.add(n);
					}
				}
			}
		}
		System.out.println("BFS: " + output);
		
	}
}