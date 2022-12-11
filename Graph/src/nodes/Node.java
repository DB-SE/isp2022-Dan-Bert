package nodes;

public class Node<T> extends INode<T>{
	
	public Node(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}

	@Override
	public T getData() {
		// TODO Auto-generated method stub
		return this.data;
	}

	// #if Coloured 
	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "";
	}
	// #endif
}
