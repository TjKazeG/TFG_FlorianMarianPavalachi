package es.tjkazeshop.app.factory;

import java.util.ArrayList;

import es.tjkazeshop.app.beans.Gafas;

public class ConcreteGafasFactory extends AbstractFactory<Gafas, String>{
	String[] descripciones;
	Float[] precios;
	Integer[] stocks;
	String[] formas;
	String[] materiales;
	
	public ConcreteGafasFactory(String[] elements, String[] descripciones, Float[] precios,
			Integer[] stocks, String[] formas, String[] materiales) {
		super(elements, new ArrayList<Gafas>());
		this.descripciones = descripciones;
		this.precios = precios;
		this.stocks = stocks;
		this.formas = formas;
		this.materiales = materiales;
	}

	protected  Gafas getNextElement(int i) {
		return new Gafas(elements[i], descripciones[i], precios[i], stocks[i], formas[i], materiales[i]);
	};
}
