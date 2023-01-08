import java.util.ArrayList;

public class Graph {
	
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
		
		public void TestGraph() {
			System.out.println("Graph will be tested: \n");
		}

}