package assignment1;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		
		
		//build labeled Graph
		
		
		Graph labGraph = new Graph();
		
		Node<String> nodeA = new Node<String>("A");
		Node<String> nodeB = new Node<String>("B");
		Node<String> nodeC = new Node<String>("C");
		Node<String> nodeD = new Node<String>("D");
		Node<String> nodeE = new Node<String>("E");
		
		
		labGraph.AddEntry(new LabeledFactory(nodeA, nodeB));
		labGraph.AddEntry(new LabeledFactory(nodeA, nodeC));
		labGraph.AddEntry(new LabeledFactory(nodeB, nodeC));
		labGraph.AddEntry(new LabeledFactory(nodeC, nodeD));
		labGraph.AddEntry(new LabeledFactory(nodeD, nodeA));
		
		System.out.println("Labeled Graph: " + labGraph.getConnections());
		
		Graph weiGraph = new Graph();
		
		
		weiGraph.AddEntry(new WeightedFactory(nodeA, nodeB, 8));
		weiGraph.AddEntry(new WeightedFactory(nodeA, nodeC, 2));
		weiGraph.AddEntry(new WeightedFactory(nodeB, nodeC, 1));
		weiGraph.AddEntry(new WeightedFactory(nodeC, nodeB, 1));
		weiGraph.AddEntry(new WeightedFactory(nodeC, nodeD, 3));
		weiGraph.AddEntry(new WeightedFactory(nodeD, nodeB, 1));
		weiGraph.AddEntry(new WeightedFactory(nodeD, nodeE, 1));
		
		System.out.println("Weighted Graph: " + weiGraph.getConnections());
		
		
		System.out.println("Search value C in: " + weiGraph.DepthSearch(nodeB, "C", new LinkedList<>()));
		System.out.println("Search value A in: " + labGraph.DepthSearch(nodeC, "A", new LinkedList<>()));
		System.out.println("Search value 1 in: " +labGraph.DepthSearch(nodeD, "1", new LinkedList<>()));
		
		System.out.println(GraphTools.BellmanFord(weiGraph, nodeA));

	}

}
