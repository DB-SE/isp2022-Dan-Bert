package graphs;

// #if Directed
import java.util.ArrayList;

import edges.IEdge;
import nodes.INode;

public class DirectedGraphDecorator extends IGraphDecorator{
	public DirectedGraphDecorator(IGraph comp) {
		this.comp = comp;
	}

	@Override
	public void addNode(INode<?> n) {
		this.comp.addNode(n);
	}

	@Override
	public void addEdge(IEdge e) {
		this.comp.addEdge(e);
	}

	@Override
	public ArrayList<INode<?>> searchNeighbors(INode<?> root, ArrayList<IEdge> edges) {
		return this.comp.searchNeighbors(root, edges);
	}

	// #if DFS
	@Override
	public ArrayList<INode<?>> dfs() {
		return this.comp.dfs();
	}
	// #endif

	@Override
	public void print() {
		this.comp.print();
	}

	// #if Adjacency
	@Override
	public void printAdjacency() {
		this.comp.printAdjacency();
	}
	// #endif
}
// #endif

// #if !Directed 
//@class DirectedGraphDecorator{}
// #endif
