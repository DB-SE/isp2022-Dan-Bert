package main;

import java.util.List;
import interfaces.INodes;
import loader.PluginLoader;

public class BaseNode<T> {
	
	protected T data;

	public BaseNode(T data) {
		this.data = data;
	}
	
	public void ChangeColour(String s) {
		List<INodes> plugList = PluginLoader.load(INodes.class);
		for(INodes p: plugList) {
			p.ChangeColour(s);
		}
	}
	
	public void ChangeLabel(String s) {
		List<INodes> plugList = PluginLoader.load(INodes.class);
		for(INodes p: plugList) {
			p.ChangeLabel(s);
		}
	}

	public String toString() {
		List<INodes> plugList = PluginLoader.load(INodes.class);
		String returnMessage = data.toString() + " ";
		for(INodes p: plugList) {
			returnMessage = returnMessage + "/" + p.getPrint();
		}
		return returnMessage;
	}

	public T getData() {
		return this.data;
	}



}
