package edges;

// #if Weighted
//@import nodes.INode;
//@
//@public class WeightedEdgeDecorator extends IEdgeDecorator {
//@	private int weight;
//@
//@	public WeightedEdgeDecorator(IEdge comp, int weight) {
//@		this.comp = comp;
//@		this.weight = weight;
//@	}
//@	
//@	@Override
//@	public INode<?> getNodeA() {
//@		return this.comp.getNodeA();
//@	}
//@
//@	@Override
//@	public INode<?> getNodeB() {
//@		return this.comp.getNodeB();
//@	}
//@
//@	@Override
//@	public int getWeight() {
//@		return this.weight;
//@	}
//@
//@	@Override
//@	public boolean contains(INode<?> first, INode<?> second) {
//@		return this.comp.contains(first, second);
//@	}
//@
//@	@Override
//@	public INode<?> neighbor(INode<?> root) {
//@		return this.comp.neighbor(root);
//@	}
//@
//@	@Override
//@	public int compareTo(IEdge o) {
//@		int a = this.getWeight();
//@		int b = o.getWeight();
//@		if(a < b) return -1;
//@		else if(a > b) return 1;
//@		else return 0;
//@	}
//@}
// #endif

// #if !Weighted
class WeightedEdgeDecorator{}
// #endif
