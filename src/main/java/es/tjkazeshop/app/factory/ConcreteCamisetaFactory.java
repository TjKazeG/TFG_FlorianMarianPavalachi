package es.tjkazeshop.app.factory;

import java.util.ArrayList;

import es.tjkazeshop.app.beans.Camiseta;

public class ConcreteCamisetaFactory extends AbstractFactory<Camiseta, String> {
	String[] descripciones;
	Float[] precios;
	Integer[] stocks;
	String[] tallas;
	String[] colores;
	String[] tiposManga;
	
	
	public ConcreteCamisetaFactory(String[] elements,
			String[] descripciones, Float[] precios, Integer[] stocks, String[] tallas, String[] colores,
			String[] tiposManga) {
		super(elements, new ArrayList<Camiseta>());
		this.descripciones = descripciones;
		this.precios = precios;
		this.stocks = stocks;
		this.tallas = tallas;
		this.colores = colores;
		this.tiposManga = tiposManga;
	}


	@Override
	protected  Camiseta getNextElement(int i) {
		return new Camiseta(elements[i], descripciones[i], precios[i], stocks[i], tallas[i], colores[i], tiposManga[i]);
	};
}
