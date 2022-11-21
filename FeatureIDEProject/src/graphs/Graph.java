package graphs;

import java.util.*;

import edges.*;
import nodes.INode;

public class Graph extends IGraph{	
	private ArrayList<INode<?>> nodes;
	private ArrayList<IEdge> edges;
	
	public Graph() {
		nodes = new ArrayList<INode<?>>();
		edges = new ArrayList<IEdge>();
	}

	@Override
	public void addNode(INode<?> n) {
		this.nodes.add(n);
	}

	@Override
	public void addEdge(IEdge e) {
		if(this.nodes.contains(e.getNodeA()) && this.nodes.contains(e.getNodeB())) {
			this.edges.add(e);
		}
	}

	@Override
	public ArrayList<INode<?>> searchNeighbors(INode<?> root, ArrayList<IEdge> edges) {
		ArrayList<INode<?>>	neighbors = new ArrayList<INode<?>>();
		for(IEdge e: edges) {
			INode<?> neighbor = e.neighbor(root);
			if(neighbor!=null) {
				neighbors.add(neighbor);
			}
		}
		return neighbors;
	}

	// #if DFS
	@Override
	public ArrayList<INode<?>> dfs() {
		Stack<INode<?>> toVisit = new Stack<INode<?>>();
		ArrayList<INode<?>> marked = new ArrayList<INode<?>>();
		
		if(!this.nodes.isEmpty()) {
			toVisit.add(this.nodes.get(0));
			marked.add(this.nodes.get(0));
			
			while(!toVisit.isEmpty()) {
				INode<?> tmp = toVisit.pop();
				for(INode<?> n: searchNeighbors(tmp, this.edges)) {
					if(!marked.contains(n)) {
						toVisit.add(n);
						marked.add(n);
					}
				}
			}
		}
		
		return marked;
	}
	// #endif

	// #if MST
//@	@Override
//@	public ArrayList<IEdge> mst() {
//@		if(!this.nodes.isEmpty()) {
//@			INode<?> randomNode = this.nodes.get(0);
//@			ArrayList<INode<?>> unVisitedNodes = new ArrayList<>(this.nodes);
//@			ArrayList<INode<?>> visitedNodes = new ArrayList<>();
//@			visitedNodes.add(randomNode);
//@			unVisitedNodes.remove(randomNode);
//@			
//@			ArrayList<IEdge> mstEdges = new ArrayList<>();
//@			while(mstEdges.size() < this.nodes.size() -1){
//@				
//@				// init variables (disregard values)
//@				int nextEdgeInitWeight = Integer.MAX_VALUE;
//@				IEdge nextEdge = new Edge(null, null);
//@				INode<?> nextVisited = this.nodes.get(0);
//@				
//@				for(INode<?> n: visitedNodes){
//@					ArrayList<IEdge> edgesToUnivisitedNodes = new ArrayList<>();
//@					//fill edgesToUnvisitedNode
//@					for(IEdge e: this.edges) {
//@						if(unVisitedNodes.contains(e.neighbor(n))) {
//@							edgesToUnivisitedNodes.add(e);
//@						}
//@					}
//@					
//@					if(!edgesToUnivisitedNodes.isEmpty()) {
//@						Collections.sort(edgesToUnivisitedNodes);
//@						IEdge smallestEdge = edgesToUnivisitedNodes.get(0);
//@						if (smallestEdge.getWeight() < nextEdgeInitWeight){
//@							nextEdge = smallestEdge;
//@							nextEdgeInitWeight = smallestEdge.getWeight();
//@							nextVisited = smallestEdge.neighbor(n);
//@						}
//@					}
//@				}
//@				mstEdges.add(nextEdge);
//@				visitedNodes.add(nextVisited);
//@				unVisitedNodes.remove(nextVisited);
//@			}
//@			return mstEdges;
//@		} else return new ArrayList<IEdge>();
//@	}
	// #endif

	@Override
	public void print() {
		this.edges.toString();
	}

	// #if Adjacency
	@Override
	public void printAdjacency() {
		ArrayList<ArrayList<Integer>> adjacencyMatrix = 
				new ArrayList<>();
		
		for (INode<?> nodeA: this.nodes) {
			ArrayList<Integer> row = new ArrayList<>();
			for (INode<?> nodeB: this.nodes) {
				// doofe Implementierung aber es funktioniert
				int connected = 0; // 0 stands for false
				for(IEdge e: this.edges) {
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
		System.out.println("N: " + this.nodes);
		for (int i = 0; i < this.nodes.size(); i++) {
			System.out.println(this.nodes.get(i) + ": "+ adjacencyMatrix.get(i));
		}
	}
	// #endif
}
