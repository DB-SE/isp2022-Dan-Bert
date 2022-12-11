import interfaces.IEdges;
import main.BaseEdge;
import main.BaseNode;

public class Directed implements IEdges {

	@Override
	public float ChangeWeight(float value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(BaseEdge selfRef, BaseNode<?> first, BaseNode<?> second) {
		if(selfRef.getNodeA().equals(first) && selfRef.getNodeB().equals(second)) {
			return true;
		}else return false;
	}

	@Override
	public BaseNode<?> neighbor(BaseEdge selfRef, BaseNode<?> root) {
		if(selfRef.getNodeA().equals(root)) {
			return selfRef.getNodeB();
		} else return null; 
	}

}
