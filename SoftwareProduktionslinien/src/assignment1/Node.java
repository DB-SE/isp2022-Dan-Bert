package assignment1;

public class Node<T> {
	private T label;

	public T getLabel() {
		return label;
	}

	public Node(T label) {
		this.label = label;
	}
	
	
	public String toString() {
		return String.valueOf(label);
	}
	
}
