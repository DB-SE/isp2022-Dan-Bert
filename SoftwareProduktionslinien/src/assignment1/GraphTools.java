package assignment1;

import java.util.HashMap;
import java.util.LinkedList;

public abstract class GraphTools {
	
	
	public static LinkedList<Tuple<Node<?>, Node<?>>> BellmanFord(Graph graph, Node<?> startNode){
		
		//TypeCheck
		for(Connection c: graph.getConnections()) {
			if(!(c instanceof WeightedConnection)){
				throw new IllegalArgumentException("not a fully weighted graph");
			}
		}
		
		// Distance "Matrix" from start to all
		HashMap<Node<?>, Tuple<Double, Node<?>>> costMapping = new HashMap<>();
		for(Node<?> node : graph.getNodes()) {
			costMapping.put(node, new Tuple<Double, Node<?>>(Double.MAX_VALUE, node));
		}
		costMapping.put(startNode, new Tuple<Double, Node<?>>(0.0, startNode));
		
		for(int i=1; i<graph.getNodes().size(); i++) {
			
			for(Connection c : graph.getConnections()) {
				
				Node<?> a = c.getStartNode();
				Node<?> b = c.getEndNode();
				
				double cost = ((WeightedConnection)c).getCost();
				
				if((costMapping.get(a).value1 != Double.MAX_VALUE) && 
						((costMapping.get(a).value1 + cost) < costMapping.get(b).value1)) {
					costMapping.put(b, new Tuple<Double, Node<?>>(costMapping.get(a).value1+ cost, a));
				}
			}
			
		}
		
		
		LinkedList<Tuple<Node<?>, Node<?>>> returnList = new LinkedList<>();
		for(Node<?> keyNode: costMapping.keySet()) {
			returnList.add(new Tuple<Node<?>, Node<?>>(costMapping.get(keyNode).value2 ,keyNode));
		}
		
		if(returnList.isEmpty())
			return null;
		
		return returnList;
	}

}
