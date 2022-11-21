package app;

import edges.*;
import graphs.*;
import nodes.*;
import superClasses.*;

public class Main {

	public static void main(String[] args) {
	// #if !SuperClasses 
		GraphFactory<Integer> gf = new GraphFactory<>();
		INode<Integer> a = gf.addNode(1);
		INode<Integer> b = gf.addNode(2);
		INode<Integer> c = gf.addNode(3);
		INode<Integer> d = gf.addNode(4);
		INode<Integer> e = gf.addNode(5);
		
		gf.addEdge(a, b, 2);
		gf.addEdge(a, c, 3);
		gf.addEdge(b, c, 2);
		gf.addEdge(b, e, 5);
		gf.addEdge(c, e, 1);
		gf.addEdge(c, d, 1);
		
		IGraph g = gf.getGraph();	
	// #endif
		
	// #if SuperClasses 
//@		SuperGraph g = new SuperGraph();
//@		SuperNode<?> a = g.addNode(new SuperNode<>(1));
//@		SuperNode<?> b = g.addNode(new SuperNode<>(2));
//@		SuperNode<?> c = g.addNode(new SuperNode<>(3));
//@		SuperNode<?> d = g.addNode(new SuperNode<>(4));
//@		SuperNode<?> e = g.addNode(new SuperNode<>(5));
//@		
		// #if Weighted
//@		g.addEdge(new SuperEdge(a, b, 2));
//@		g.addEdge(new SuperEdge(a, c, 3));
//@		g.addEdge(new SuperEdge(b, c, 2));
//@		g.addEdge(new SuperEdge(b, e, 5));
//@		g.addEdge(new SuperEdge(c, e, 1));
//@		g.addEdge(new SuperEdge(c, d, 1));
		// #endif
		// #if !Weighted
//@		g.addEdge(new SuperEdge(a, b));
//@		g.addEdge(new SuperEdge(a, c));
//@		g.addEdge(new SuperEdge(b, c));
//@		g.addEdge(new SuperEdge(b, e));
//@		g.addEdge(new SuperEdge(c, e));
//@		g.addEdge(new SuperEdge(c, d));
		// #endif
	// #endif
	
	// #if Adjacency 
		g.printAdjacency();
	// #endif
	// #if DFS
		System.out.println("DFS: " + g.dfs());
	// #endif
	// #if MST
//@		System.out.println("MST: " + g.mst());
	// #endif
				
		g.print();
	}
}
