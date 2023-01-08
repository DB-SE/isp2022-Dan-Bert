/**
 * TODO description
 */
import java.util.ArrayList; 
import java.util.Stack; 
import java.util.Collections; 
import java.util.LinkedList; 
import java.util.Queue; 


public   class  Graph {
	
	
		public ArrayList<Node<?>> nodes;

	
		public ArrayList<Edge> edges;

	
		
		public Graph() {
			nodes = new ArrayList<Node<?>>();
			edges = new ArrayList<Edge>();
		}

	


		public void addNode(Node<?> n) {
			this.nodes.add(n);
		}

	


		public void addEdge(Edge e) {
			if(this.nodes.contains(e.getNodeA()) && this.nodes.contains(e.getNodeB())) {
				this.edges.add(e);
			}
		}

	

		public ArrayList<Node<?>> searchNeighbors(Node<?> root, ArrayList<Edge> edges) {
			ArrayList<Node<?>>	neighbors = new ArrayList<Node<?>>();
			for(Edge e: edges) {
				Node<?> neighbor = e.neighbor(root);
				if(neighbor!=null) {
					neighbors.add(neighbor);
				}
			}
			return neighbors;
		}

	
		
		 private void  TestGraph__wrappee__Base  () {
			System.out.println("Graph will be tested: \n");
		}

	
	
	 private void  TestGraph__wrappee__DFS  () {
		TestGraph__wrappee__Base();
		printDFS(this);
	}

	

	 private void  TestGraph__wrappee__MST  () {
		TestGraph__wrappee__DFS();
		printMST(this);
	}

	

	 private void  TestGraph__wrappee__Adjacency  () {
		TestGraph__wrappee__MST();
		printAdj(this);
	}

	
	
	public void TestGraph() {
		TestGraph__wrappee__Adjacency();
		printBFS(this);
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

	
	
	
	public void printAdj(Graph g) {
		ArrayList<ArrayList<Integer>> adjacencyMatrix = new ArrayList<ArrayList<Integer>>();
		
		for (Node<?> nodeA: g.nodes) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (Node<?> nodeB: g.nodes) {
				// doofe Implementierung aber es funktioniert
				int connected = 0; // 0 stands for false
				for(Edge e: g.edges) {
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
		System.out.println("Adjacency Matrix: ");
		System.out.println("N: " + "\t" + g.nodes);
		for (int i = 0; i < g.nodes.size(); i++) {
			System.out.println(g.nodes.get(i) + ": " + "\t" + adjacencyMatrix.get(i));
		}

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
