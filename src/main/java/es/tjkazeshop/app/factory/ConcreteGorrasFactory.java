package es.tjkazeshop.app.factory;

import java.util.ArrayList;

import es.tjkazeshop.app.beans.Gorra;

public class ConcreteGorrasFactory extends AbstractFactory<Gorra, String>{
	String[] descripciones;
	Float[] precios;
	Integer[] stocks;
	Float[] tallas;
	String[] colores;
	public ConcreteGorrasFactory(String[] elements, String[] descripciones, Float[] precios,
			Integer[] stocks, Float[] tallas, String[] colores) {
		super(elements, new ArrayList<Gorra>());
		this.descripciones = descripciones;
		this.precios = precios;
		this.stocks = stocks;
		this.tallas = tallas;
		this.colores = colores;
	}
	protected  Gorra getNextElement(int i) {
		return new Gorra(elements[i], descripciones[i], precios[i], stocks[i], tallas[i], colores[i]);
	};
	
}
