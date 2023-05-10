package es.tjkazeshop.app.factory;

import java.util.ArrayList;

import es.tjkazeshop.app.beans.Pantalones;

public class ConcretePantalonesFactory extends AbstractFactory<Pantalones, String> {
	String[] descripciones;
	Float[] precios;
	Integer[] stocks;
	String[] tallas;
	String[] telas;
	
	public ConcretePantalonesFactory(String[] elements, String[] descripciones,
			Float[] precios, Integer[] stocks, String[] tallas, String[] telas) {
		super(elements, new ArrayList<Pantalones>());
		this.descripciones = descripciones;
		this.precios = precios;
		this.stocks = stocks;
		this.tallas = tallas;
		this.telas = telas;
	}

	protected  Pantalones getNextElement(int i) {
		return new Pantalones(elements[i], descripciones[i], precios[i], stocks[i], tallas[i], telas[i]);
	};
	
}
