package assignment1;

public class Connection<T,C extends Number> {
	private C cost;
	private Node<T> target;

	public C getCost() {
		return cost;
	}

	public void setCost(C cost) {
		this.cost = cost;
	}

	public Node<T> getTarget() {
		return target;
	}

	public void setTarget(Node<T> target) {
		this.target = target;
	}

	public Connection(C cost, Node<T> target) {
		this.cost = cost;
		this.target = target;
	}

}
