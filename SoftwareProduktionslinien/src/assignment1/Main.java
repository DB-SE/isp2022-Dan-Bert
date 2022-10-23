package assignment1;

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
		
		
		
		labGraph.AddEntry(new LabeledFactory(nodeA, nodeB));
		labGraph.AddEntry(new LabeledFactory(nodeA, nodeC));
		labGraph.AddEntry(new LabeledFactory(nodeB, nodeC));
		labGraph.AddEntry(new LabeledFactory(nodeC, nodeD));
		labGraph.AddEntry(new LabeledFactory(nodeD, nodeA));
		
		System.out.println("Labeled Graph: " + labGraph.getConnections());
		
		Graph weiGraph = new Graph();
		
		
		weiGraph.AddEntry(new WeightedFactory<Integer>(nodeA, nodeB, 5));
		weiGraph.AddEntry(new WeightedFactory<Integer>(nodeA, nodeC, 2));
		weiGraph.AddEntry(new WeightedFactory<Integer>(nodeB, nodeC, 3));
		weiGraph.AddEntry(new WeightedFactory<Integer>(nodeC, nodeD, 3));
		weiGraph.AddEntry(new WeightedFactory<Integer>(nodeD, nodeA, 1));
		
		System.out.println("Weighted Graph: " + weiGraph.getConnections());
		
		

	}

}
