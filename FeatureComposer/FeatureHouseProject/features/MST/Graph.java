/**
 * TODO description
 */
import java.util.ArrayList;
import java.util.Collections;

public class Graph {

	public void TestGraph() {
		original();
		printMST(this);
	}
	
	public void printMST(Graph g) {
		if(!g.nodes.isEmpty()) {
			Node<?> randomNode = g.nodes.get(0);
			ArrayList<Node<?>> unVisitedNodes = new ArrayList<Node<?>>(g.nodes);
		ArrayList<Node<?>> visitedNodes = new ArrayList<Node<?>>();
			visitedNodes.add(randomNode);
		unVisitedNodes.remove(randomNode);
			
			ArrayList<Edge> mstEdges = new ArrayList<Edge>();
			while(mstEdges.size() < g.nodes.size() -1){
				
				// init variables (disregard values)
				float nextEdgeInitWeight = Float.MAX_VALUE;
				Edge nextEdge = new Edge(null, null);
				Node<?> nextVisited = g.nodes.get(0);
				
				for(Node<?> n: visitedNodes){
					ArrayList<Edge> edgesToUnivisitedNodes = new ArrayList<Edge>();
					//fill edgesToUnvisitedNode
					for(Edge e: g.edges) {
						if(unVisitedNodes.contains(e.neighbor(n))) {
							edgesToUnivisitedNodes.add(e);
						}
					}
					
					if(!edgesToUnivisitedNodes.isEmpty()) {
						Collections.sort(edgesToUnivisitedNodes);
						Edge smallestEdge = edgesToUnivisitedNodes.get(0);
						if (smallestEdge.getWeight() < nextEdgeInitWeight){
							nextEdge = smallestEdge;
							nextEdgeInitWeight = smallestEdge.getWeight();
							nextVisited = smallestEdge.neighbor(n);
						}
					}
				}
				mstEdges.add(nextEdge);
				visitedNodes.add(nextVisited);
				unVisitedNodes.remove(nextVisited);
			}
			System.out.println("MST: " + mstEdges);
		} else System.out.println("No result");
	}
}