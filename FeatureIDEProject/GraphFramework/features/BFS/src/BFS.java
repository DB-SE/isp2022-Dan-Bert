import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import interfaces.IAlgorithms;
import main.BaseNode;
import main.Graph;

public class BFS implements IAlgorithms {

	@Override
	public void printResult(Graph g){
		Queue<BaseNode<?>> toVisit = new LinkedList<BaseNode<?>>();
		ArrayList<BaseNode<?>> marked = new ArrayList<BaseNode<?>>();
		ArrayList<BaseNode<?>> output = new ArrayList<BaseNode<?>>();
		
		if(!g.nodes.isEmpty()) {
			toVisit.add(g.nodes.get(0));
			marked.add(g.nodes.get(0));
			
			while(!toVisit.isEmpty()) {
				BaseNode<?> tmp = toVisit.poll();
				output.add(tmp);
				for(BaseNode<?> n: g.searchNeighbors(tmp, g.edges)) {
					if(!marked.contains(n)) {
						toVisit.add(n);
						marked.add(n);
					}
				}
			}
		}
		System.out.println("BFS: " + output);
		
	}

}
