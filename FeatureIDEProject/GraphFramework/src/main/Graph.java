package main;

import java.util.*;

import interfaces.IAlgorithms;
import loader.PluginLoader;

public class Graph{	
	public ArrayList<BaseNode<?>> nodes;
	public ArrayList<BaseEdge> edges;
	
	public Graph() {
		nodes = new ArrayList<BaseNode<?>>();
		edges = new ArrayList<BaseEdge>();
	}


	public void addNode(BaseNode<?> n) {
		this.nodes.add(n);
	}


	public void addEdge(BaseEdge e) {
		if(this.nodes.contains(e.getNodeA()) && this.nodes.contains(e.getNodeB())) {
			this.edges.add(e);
		}
	}

	public ArrayList<BaseNode<?>> searchNeighbors(BaseNode<?> root, ArrayList<BaseEdge> edges) {
		ArrayList<BaseNode<?>>	neighbors = new ArrayList<BaseNode<?>>();
		for(BaseEdge e: edges) {
			BaseNode<?> neighbor = e.neighbor(root);
			if(neighbor!=null) {
				neighbors.add(neighbor);
			}
		}
		return neighbors;
	}
	
	public void TestGraph() {
		List<IAlgorithms> plugList = PluginLoader.load(IAlgorithms.class);
		
		for(IAlgorithms p: plugList) {
			p.printResult(this);
			System.out.println("\n-----------------------------------------------------------------------------\n");
		}
	}
}
