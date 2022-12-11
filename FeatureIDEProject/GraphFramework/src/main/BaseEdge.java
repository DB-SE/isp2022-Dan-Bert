package main;

import java.util.List;

import interfaces.IAlgorithms;
import interfaces.IEdges;
import loader.PluginLoader;

public class BaseEdge implements Comparable<BaseEdge> {
	
	private float weight;

	public BaseNode<?> a;
	public BaseNode<?> b;
	
	// default Undirected and weight 0	
	public BaseEdge(BaseNode<?> a, BaseNode<?> b) {
		this.a = a;
		this.b = b;
	}
	
	
	public BaseNode<?> getNodeA() {
		// TODO Auto-generated method stub
		return this.a;
	}


	public BaseNode<?> getNodeB() {
		// TODO Auto-generated method stub
		return this.b;
	}
	
	public String toString() {
		return a + "-" + b;
	}
	

	public void changeWeight(float value) {
		float tmp = 0;
		List<IEdges> plugList = PluginLoader.load(IEdges.class);
		for(IEdges p: plugList) {
			tmp += p.ChangeWeight(value);
		}
		
		this.weight = tmp;
	}
	public float getWeight() {
		return weight;
	}
	
	public boolean contains( BaseNode<?> first, BaseNode<?> second) {
		List<IEdges> plugList = PluginLoader.load(IEdges.class);
		boolean returnValue = true;
		for(IEdges p: plugList) {
			returnValue = returnValue && p.contains(this, first, second);
		}
		return returnValue;
	}
	
	public BaseNode<?> neighbor(BaseNode<?> root) {
		List<IEdges> plugList = PluginLoader.load(IEdges.class);
		BaseNode<?> res = null;
		for(IEdges p: plugList) {
			BaseNode<?> tmp = p.neighbor(this, root);
			
			if(tmp != null) {
				res = tmp;
				break;
			}
		}
		
		return res;
	}
	
	public int compareTo(BaseEdge o) {
		float a = this.getWeight();
		float b = o.getWeight();
		if(a < b) return -1;
		else if(a > b) return 1;
		else return 0;
	}
}
