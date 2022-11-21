package superClasses;

import java.util.*;

public class SuperGraph {	
	private ArrayList<SuperNode<?>> nodes;
	private ArrayList<SuperEdge> edges;
	
	public SuperGraph() {
		nodes = new ArrayList<SuperNode<?>>();
		edges = new ArrayList<SuperEdge>();
	}

	public SuperNode<?> addNode(SuperNode<?> n) {
		this.nodes.add(n);
		return n;
	}

	public void addEdge(SuperEdge e) {
		if(this.nodes.contains(e.a) && this.nodes.contains(e.b)) {
			this.edges.add(e);
		}
	}

	public ArrayList<SuperNode<?>> searchNeighbors(SuperNode<?> root, ArrayList<SuperEdge> edges) {
		ArrayList<SuperNode<?>>	neighbors = new ArrayList<SuperNode<?>>();
		for(SuperEdge e: edges) {
			SuperNode<?> neighbor = e.neighbor(root);
			if(neighbor!=null) {
				neighbors.add(neighbor);
			}
		}
		return neighbors;
	}

	// #if DFS
	public ArrayList<SuperNode<?>> dfs() {
		Stack<SuperNode<?>> toVisit = new Stack<SuperNode<?>>();
		ArrayList<SuperNode<?>> marked = new ArrayList<SuperNode<?>>();
		
		if(!this.nodes.isEmpty()) {
			toVisit.add(this.nodes.get(0));
			marked.add(this.nodes.get(0));
			
			while(!toVisit.isEmpty()) {
				SuperNode<?> tmp = toVisit.pop();
				for(SuperNode<?> n: searchNeighbors(tmp, this.edges)) {
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
//@	public ArrayList<SuperEdge> mst() {
//@		if(!this.nodes.isEmpty()) {
//@			SuperNode<?> randomNode = this.nodes.get(0);
//@			ArrayList<SuperNode<?>> unVisitedNodes = new ArrayList<>(this.nodes);
//@			ArrayList<SuperNode<?>> visitedNodes = new ArrayList<>();
//@			visitedNodes.add(randomNode);
//@			unVisitedNodes.remove(randomNode);
//@			
//@			ArrayList<SuperEdge> mstEdges = new ArrayList<>();
//@			while(mstEdges.size() < this.nodes.size() -1){
//@				
//@				// init variables (disregard values)
//@				int nextEdgeInitWeight = Integer.MAX_VALUE;
//@				SuperEdge nextEdge = new SuperEdge(null, null);
//@				SuperNode<?> nextVisited = this.nodes.get(0);
//@				
//@				for(SuperNode<?> n: visitedNodes){
//@					ArrayList<SuperEdge> edgesToUnivisitedNodes = new ArrayList<>();
//@					//fill edgesToUnvisitedNode
//@					for(SuperEdge e: this.edges) {
//@						if(unVisitedNodes.contains(e.neighbor(n))) {
//@							edgesToUnivisitedNodes.add(e);
//@						}
//@					}
//@					
//@					if(!edgesToUnivisitedNodes.isEmpty()) {
//@						Collections.sort(edgesToUnivisitedNodes);
//@						SuperEdge smallestEdge = edgesToUnivisitedNodes.get(0);
//@						if (smallestEdge.weight < nextEdgeInitWeight){
//@							nextEdge = smallestEdge;
//@							nextEdgeInitWeight = smallestEdge.weight;
//@							nextVisited = smallestEdge.neighbor(n);
//@						}
//@					}
//@				}
//@				mstEdges.add(nextEdge);
//@				visitedNodes.add(nextVisited);
//@				unVisitedNodes.remove(nextVisited);
//@			}
//@			return mstEdges;
//@		} else return new ArrayList<SuperEdge>();
//@	}
	// #endif

	public void print() {
		this.edges.toString();
	}

	// #if Adjacency
	public void printAdjacency() {
		ArrayList<ArrayList<Integer>> adjacencyMatrix = new ArrayList<>();
		
		for (SuperNode<?> nodeA: this.nodes) {
			ArrayList<Integer> row = new ArrayList<>();
			for (SuperNode<?> nodeB: this.nodes) {
				// doofe Implementierung aber es funktioniert
				int connected = 0; // 0 stands for false
				for(SuperEdge e: this.edges) {
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

