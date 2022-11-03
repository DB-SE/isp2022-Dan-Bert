package assignment2;


public class Main {

	public static void main(String[] args) {
		GraphFactory<Integer> gf = new GraphFactory<>();
		INode<Integer> a = gf.addNode(1);
		INode<Integer> b = gf.addNode(2);
		INode<Integer> c = gf.addNode(3);
		INode<Integer> d = gf.addNode(4);
		INode<Integer> e = gf.addNode(5);
		
		gf.addEdge(a, b, 2);
		gf.addEdge(a, c, 3);
		gf.addEdge(b, c, 2);
		gf.addEdge(b, e, 5);
		gf.addEdge(c, e, 1);
		gf.addEdge(c, d, 1);
		
		
		IGraph g = gf.getGraph();
		g.dfs();
		g.print();
		System.out.print(g.mst());
		
	}
}
