package assignment2;

public class GraphFactory<T> {
	/**
	 * FACTORY & DECORATOR
	 * 
	 */
	private IGraph graph;
	
	public GraphFactory() {
		this.graph = new Graph();
		if (Config.directed) {
			this.graph = new DirectedGraphDecorator(this.graph);
		}
	}
	
	public IGraph getGraph() {
		return this.graph;
	}
	
	public INode<T> addNode(T data) {
		return addNode(data, "defaultLabel");
	}
	
	public INode<T> addNode(T data, String label) {
		INode<T> n = new Node<T>(data);
		if(Config.label) {
			n = new LabeledNode<T>(new Node<T>(data), label);
		} 
		graph.addNode(n);
		return n;
	}
	
	public void addEdge(INode<T> a, INode<T> b) {
		addEdge(a, b, 0);
	}
	
	public void addEdge(INode<T> a, INode<T> b, int weight) {
		IEdge e = new Edge(a, b);
		if(Config.weight) {
			e = new WeightedEdgeDecorator(e, weight);
		}
		if (Config.directed) {
			e = new DirectedEdgeDecorator(e);
		}
		graph.addEdge(e);
	}

}
