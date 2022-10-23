package assignment1;

public class WeightedFactory implements IConnectionFactory{

	private Node<?> startNode;
	private Node<?> endNode;
	private double cost;
	
	
	public WeightedFactory(Node<?> startNode, Node<?> endNode, double cost) {
		this.startNode = startNode;
		this.endNode = endNode;
		this.cost = cost;
	}


	@Override
	public Connection generateConnection() {
		return new WeightedConnection(startNode, endNode, cost);
	}

}
