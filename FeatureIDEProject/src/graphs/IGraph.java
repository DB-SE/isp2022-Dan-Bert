package graphs;

import java.util.ArrayList;

import edges.IEdge;
import nodes.INode;

public abstract class IGraph {
	public abstract void addNode(INode<?> n);

	public abstract void addEdge(IEdge e);

	public abstract ArrayList<INode<?>> searchNeighbors(INode<?> root, ArrayList<IEdge> edges);

	// #if DFS
	public abstract ArrayList<INode<?>> dfs();
	// #endif
	
	// #if MST 
//@	public abstract ArrayList<IEdge> mst();
	// #endif
	
	// #if Adjacency
	public abstract void printAdjacency();
	// #endif
	
	public abstract void print();
}
