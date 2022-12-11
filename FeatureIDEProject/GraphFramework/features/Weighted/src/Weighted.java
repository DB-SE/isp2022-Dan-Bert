import interfaces.IEdges;
import main.BaseEdge;
import main.BaseNode;

public class Weighted implements IEdges {

	@Override
	public float ChangeWeight(float value) {
		// TODO Auto-generated method stub
		return value;
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
