package assignment1;

public class WeightedConnection<T extends Number> extends Connection{

	private T cost;
	
	public T getCost() {
		return cost;
	}

	public WeightedConnection(Node<?> startNode, Node<?> endNode, T cost) {
		super(startNode, endNode);
		this.cost = cost;
	}

}
