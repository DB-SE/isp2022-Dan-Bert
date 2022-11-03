package assignment2;

import java.util.ArrayList;

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

	@Override
	public ArrayList<INode<?>> dfs() {
		return this.comp.dfs();
	}

	@Override
	public ArrayList<IEdge> mst() {
		// TODO Eigene Impl (mst f�r Directed Graph wird anders berechnet)
		return null;
	}

	@Override
	public void print() {
		this.comp.print();
	}
}
