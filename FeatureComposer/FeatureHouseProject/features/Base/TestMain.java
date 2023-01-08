import java.util.ArrayList;

/**
 * TODO description
 */
public class TestMain {
	
	public void ChangeGraph(Graph g) {
		System.out.println("");
	}

	public static void main(String[] args) {
		
		Graph simpleGraph = new Graph();
		
		Node<String> a = new Node<String>("A");
		Node<String> b = new Node<String>("B");
		Node<String> c = new Node<String>("C");
		Node<String> d = new Node<String>("D");
		Node<String> e = new Node<String>("E");
		
		simpleGraph.addNode(a);
		simpleGraph.addNode(b);
		simpleGraph.addNode(c);
		simpleGraph.addNode(d);
		simpleGraph.addNode(e);
		
		Edge e1 = new Edge(a, b);
		Edge e2 = new Edge(a, c);
		Edge e3 = new Edge(c, d);
		Edge e4 = new Edge(c, e);
		Edge e5 = new Edge(b, d);

		simpleGraph.addEdge(e1);
		simpleGraph.addEdge(e2);
		simpleGraph.addEdge(e3);
		simpleGraph.addEdge(e4);
		simpleGraph.addEdge(e5);
		
		new TestMain().ChangeGraph(simpleGraph);
		
		simpleGraph.TestGraph();
	}
}