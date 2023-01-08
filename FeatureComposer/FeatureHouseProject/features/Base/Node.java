/**
 * TODO description
 */
public class Node <T> {
	
	protected T data;

	public Node(T data) {
		this.data = data;
	}

	public String toString() {
		return data.toString();
	}

	public T getData() {
		return this.data;
	}


}