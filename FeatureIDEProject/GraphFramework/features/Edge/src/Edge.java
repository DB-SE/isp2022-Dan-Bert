import interfaces.IEdges;
import main.BaseEdge;
import main.BaseNode;

public class Edge implements IEdges {

	@Override
	public float ChangeWeight(float value) {
		return 0;
	}

	@Override
	public boolean contains(BaseEdge selfRef, BaseNode<?> first, BaseNode<?> second) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public BaseNode<?> neighbor(BaseEdge selfRef, BaseNode<?> root) {
		// TODO Auto-generated method stub
		return null;
	}

}
