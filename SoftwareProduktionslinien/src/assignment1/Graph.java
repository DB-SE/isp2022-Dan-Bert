package assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
	
	private ArrayList<Node<?>> nodes;
	private ArrayList<Connection> connections;
	
	public ArrayList<Node<?>> getNodes() {
		return nodes;
	}

	public ArrayList<Connection> getConnections() {
		return connections;
	}

	public Graph() {
		nodes = new ArrayList<>();
		connections = new ArrayList<>();
	}
	
	public void AddEntry(IConnectionFactory conFact) {
		Connection c = conFact.generateConnection();
		Node<?> startNode = c.getStartNode();
		Node<?> endNode = c.getEndNode();
		
		if(!connections.contains(c)) {
			connections.add(c);
		}
		
		if(!nodes.contains(startNode)) {
			nodes.add(startNode);
		}
		
		if(!nodes.contains(endNode)) {
			nodes.add(endNode);
		}
		
	}
	
	public<T> Node<?> DepthSearch(Node<?> startNode, T targetValue, LinkedList<Node<?>> alreadyVisited ) {
		if(startNode.getLabel() == targetValue)
			return startNode;
		alreadyVisited.add(startNode);
		
		for(Connection c : connections) {
			if(c.getStartNode() != startNode) {
				continue;
			}
			
			if(!alreadyVisited.contains(c.getEndNode())) {
				Node <?> res = DepthSearch(c.getEndNode(), targetValue, alreadyVisited);
				if(res != null)
					return res;
			}
		}
		
		return null;
		
	}			
	

}
