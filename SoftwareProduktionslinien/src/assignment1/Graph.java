package assignment1;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Graph<T, C extends Number> {
	private HashMap<Node<T>, ArrayList<Connection<T,C>>> graph;

	public HashMap<Node<T>, ArrayList<Connection<T, C>>> getGraph() {
		return graph;
	}
	
	public void AddConnection(Node<T> startNode, Node<T> endNode, C cost) {
		if(graph == null)
			graph = new HashMap<Node<T>, ArrayList<Connection<T,C>>>();
		if(!graph.containsKey(startNode)) {
			graph.put(startNode, (new ArrayList<Connection<T, C>>()));
		}
		
		graph.get(startNode).add(new Connection<T,C>(cost, endNode));
	}
	
//	private boolean CheckForDublicates(Node<T> startNode, Node<T> endNode) {
//		
//		for (Connection con : graph.get(startNode)) {
//			if(con.getTarget() == endNode)
//				return true;
//		}
//		return false;
//	}

}
