package main;

public class Main {

	public static void main(String[] args) {
		Graph simpleGraph = new Graph();
		
		
		BaseNode<String> a = new BaseNode<String>("A");
		a.ChangeColour("Green");
		a.ChangeLabel("Circle");
		
		BaseNode<String> b = new BaseNode<String>("B");
		BaseNode<String> c = new BaseNode<String>("C");
		
		c.ChangeColour("Red");
		
		BaseNode<String> d = new BaseNode<String>("D");
		
		d.ChangeLabel("Rectangle");
		BaseNode<String> e = new BaseNode<String>("E");
		
		simpleGraph.addNode(a);
		simpleGraph.addNode(b);
		simpleGraph.addNode(c);
		simpleGraph.addNode(d);
		simpleGraph.addNode(e);
		
		BaseEdge e1 = new BaseEdge(a, b);
		e1.changeWeight(5);
		BaseEdge e2 = new BaseEdge(a, c);
		e2.changeWeight(1);
		BaseEdge e3 = new BaseEdge(c, d);
		e3.changeWeight(1);
		BaseEdge e4 = new BaseEdge(c, e);
		e4.changeWeight(2);
		BaseEdge e5 = new BaseEdge(b, d);
		e5.changeWeight(4);
		
		simpleGraph.addEdge(e1);
		simpleGraph.addEdge(e2);
		simpleGraph.addEdge(e3);
		simpleGraph.addEdge(e4);
		simpleGraph.addEdge(e5);
		
		simpleGraph.TestGraph();
				
	}

}
