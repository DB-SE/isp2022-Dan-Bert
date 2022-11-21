package app;

import edges.*;
import graphs.*;
import nodes.*;

public class GraphFactory<T> {
	/**
	 * FACTORY & DECORATOR
	 * 
	 */
	private IGraph graph;
	
	public GraphFactory() {
		this.graph = new Graph();
		// #if Directed 
			this.graph = new DirectedGraphDecorator(this.graph);
		// #endif
	}
	
	public IGraph getGraph() {
		return this.graph;
	}
	
	public INode<T> addNode(T data) {
		return addNode(data, "defaultLabel", "defaultColor");
	}
	
	public INode<T> addNode(T data, String label, String color) {
		INode<T> n = new Node<T>(data);
		// #if Labeled 
			n = new LabeledNodeDecorator<T>(new Node<T>(data), label);
		// #endif
		// #if Coloured  
			n = new ColouredNodeDecorator<T>(new Node<T>(data), color);
		// #endif
					
		graph.addNode(n);
		return n;
	}
	
	public void addEdge(INode<T> a, INode<T> b) {
		addEdge(a, b, 0);
	}
	
	public void addEdge(INode<T> a, INode<T> b, int weight) {
		IEdge e = new Edge(a, b);
		// #if Weighted 
//@			e = new WeightedEdgeDecorator(e, weight);
		// #endif
		// #if Directed
			e = new DirectedEdgeDecorator(e);
		// #endif
		graph.addEdge(e);
	}

}
