package assignment1;

public class Connection {
	private Node<?> startNode;
	private Node<?> endNode;
	
	public Node<?> getStartNode() {
		return startNode;
	}
	public Node<?> getEndNode() {
		return endNode;
	}
	public Connection(Node<?> startNode, Node<?> endNode) {
		this.startNode = startNode;
		this.endNode = endNode;
	}
	
	
	public String toString() {
		return startNode.toString() + "-" + endNode.toString();
	}
}
