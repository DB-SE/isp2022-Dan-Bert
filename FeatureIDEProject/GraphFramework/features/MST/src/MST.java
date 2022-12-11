import java.util.ArrayList;
import java.util.Collections;

import interfaces.IAlgorithms;
import main.BaseNode;
import main.BaseEdge;
import main.Graph;

public class MST implements IAlgorithms {

	@Override
	public void printResult(Graph g) {
					if(!g.nodes.isEmpty()) {
						BaseNode<?> randomNode = g.nodes.get(0);
						ArrayList<BaseNode<?>> unVisitedNodes = new ArrayList<>(g.nodes);
					ArrayList<BaseNode<?>> visitedNodes = new ArrayList<>();
						visitedNodes.add(randomNode);
					unVisitedNodes.remove(randomNode);
						
						ArrayList<BaseEdge> mstEdges = new ArrayList<>();
						while(mstEdges.size() < g.nodes.size() -1){
							
							// init variables (disregard values)
							float nextEdgeInitWeight = Float.MAX_VALUE;
							BaseEdge nextEdge = new BaseEdge(null, null);
							BaseNode<?> nextVisited = g.nodes.get(0);
							
							for(BaseNode<?> n: visitedNodes){
								ArrayList<BaseEdge> edgesToUnivisitedNodes = new ArrayList<>();
								//fill edgesToUnvisitedNode
								for(BaseEdge e: g.edges) {
									if(unVisitedNodes.contains(e.neighbor(n))) {
										edgesToUnivisitedNodes.add(e);
									}
								}
								
								if(!edgesToUnivisitedNodes.isEmpty()) {
									Collections.sort(edgesToUnivisitedNodes);
									BaseEdge smallestEdge = edgesToUnivisitedNodes.get(0);
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
						System.out.println(mstEdges);
					} else System.out.println("No result");
//		System.out.println("Fehler");
	}

}
