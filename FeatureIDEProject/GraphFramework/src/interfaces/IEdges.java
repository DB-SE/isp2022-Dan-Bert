package interfaces;

import main.BaseEdge;
import main.BaseNode;

public interface IEdges {
	
	public float ChangeWeight(float value); 	
	public boolean contains(BaseEdge selfRef, BaseNode<?> first, BaseNode<?> second);
	public BaseNode<?> neighbor(BaseEdge selfRef, BaseNode<?> root);

}
