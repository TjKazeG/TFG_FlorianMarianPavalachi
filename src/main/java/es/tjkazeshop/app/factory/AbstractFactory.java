package es.tjkazeshop.app.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFactory<T,S> {
	S[] elements=null;
	ArrayList<T> arrayList;
	public AbstractFactory(S[] elements, ArrayList<T> arrayList) {
		super();
		this.elements = elements;
		this.arrayList = arrayList;
	}
	
	public AbstractFactory(ArrayList<T> arrayList) {
		this(null,arrayList);
	}
	
	public List<T> getList(){
		for (int i = 0; i < elements.length; i++) {
			arrayList.add(getNextElement(i));
		}
		return arrayList;
	}

	protected  T getNextElement(int i) {
		return null;
	};
	
}
