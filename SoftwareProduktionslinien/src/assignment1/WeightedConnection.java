package assignment1;

public class WeightedConnection extends Connection{

	private double cost;
	
	public double getCost() {
		return cost;
	}

	public WeightedConnection(Node<?> startNode, Node<?> endNode, double cost) {
		super(startNode, endNode);
		this.cost = cost;
	}
	
	public String toString() {
		return super.toString() + ": " + cost;
	}

}
