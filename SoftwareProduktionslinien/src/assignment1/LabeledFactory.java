package assignment1;

public class LabeledFactory implements IConnectionFactory{

	private Node<?> startNode;
	private Node<?> endNode;
	
	public LabeledFactory(Node<?> startNode, Node<?> endNode) {
		this.startNode = startNode;
		this.endNode = endNode;
	}
	@Override
	public Connection generateConnection() {
		
		return new Connection(startNode, endNode);
	}

}
