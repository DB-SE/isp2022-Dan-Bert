/**
 * TODO description
 */
public class Edge {
	
	public boolean contains(Edge selfRef, Node<?> first, Node<?> second) {
		if(selfRef.getNodeA().equals(first) && selfRef.getNodeB().equals(second)) {
			return true;
		}else return false;
	}

	@Override
	public Node<?> neighbor(Edge selfRef, Node<?> root) {
		if(selfRef.getNodeA().equals(root)) {
			return selfRef.getNodeB();
		} else return null; 
	}

}