import interfaces.IEdges;
import main.BaseEdge;
import main.BaseNode;

public class Undirected implements IEdges {

	@Override
	public float ChangeWeight(float value) {
		return 0;
	}

	@Override
	public boolean contains(BaseEdge selfRef, BaseNode<?> first, BaseNode<?> second) {
		if(
				(selfRef.a.equals(first) && selfRef.b.equals(second)) ||
				(selfRef.b.equals(first) && selfRef.a.equals(second))) {
			return true;
		}else return false;
	}

	@Override
	public BaseNode<?> neighbor(BaseEdge selfRef, BaseNode<?> root) {
		if(selfRef.getNodeA().equals(root)) {
			return selfRef.b;
		} else if(selfRef.getNodeB().equals(root)) {
			return selfRef.a;
		} else return null;
	}


}
