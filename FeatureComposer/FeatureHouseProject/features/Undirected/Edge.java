/**
 * TODO description
 */
public class Edge {
	
	public boolean contains(Edge selfRef, Node<?> first, Node<?> second) {
		if(
				(selfRef.a.equals(first) && selfRef.b.equals(second)) ||
				(selfRef.b.equals(first) && selfRef.a.equals(second))) {
			return true;
		}else return false;
	}

	public Node<?> neighbor(Edge selfRef, Node<?> root) {
		if(selfRef.getNodeA().equals(root)) {
			return selfRef.b;
		} else if(selfRef.getNodeB().equals(root)) {
			return selfRef.a;
		} else return null;
	}

}