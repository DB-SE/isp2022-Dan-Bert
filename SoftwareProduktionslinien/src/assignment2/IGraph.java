package assignment2;

import java.util.ArrayList;

public abstract class IGraph {
	public abstract void addNode(INode<?> n);

	public abstract void addEdge(IEdge e);

	public abstract ArrayList<INode<?>> searchNeighbors(INode<?> root, ArrayList<IEdge> edges);

	public abstract ArrayList<INode<?>> dfs();

	public abstract ArrayList<IEdge> mst();
	
	public abstract void print();
}
