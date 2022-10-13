package assignment1;

public class Connection<T,C extends Number> {
	private C cost;
	private Node<T> start;
	private Node<T> end;

	public C getCost() {
		return cost;
	}

	public void setCost(C cost) {
		this.cost = cost;
	}
	
	public Node<T> getStart() {
		return start;
	}

	public void setStart(Node<T> start) {
		this.start = start;
	}

	public Node<T> getEnd() {
		return end;
	}

	public void setEnd(Node<T> end) {
		this.end = end;
	}

	public Connection(C cost, Node<T> start, Node<T> end) {
		this.cost = cost;
		this.start = start;
		this.end = end;
	}

}
