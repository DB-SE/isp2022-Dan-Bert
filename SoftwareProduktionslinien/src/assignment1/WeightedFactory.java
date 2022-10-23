package assignment1;

public class WeightedFactory<T extends Number> implements IConnectionFactory{

	private Node<?> startNode;
	private Node<?> endNode;
	private T cost;
	
	
	public WeightedFactory(Node<?> startNode, Node<?> endNode, T cost) {
		this.startNode = startNode;
		this.endNode = endNode;
		this.cost = cost;
	}


	@Override
	public Connection generateConnection() {
		return new WeightedConnection<T>(startNode, endNode, cost);
	}

}
