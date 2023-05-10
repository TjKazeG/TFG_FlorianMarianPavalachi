package es.tjkazeshop.app.factory;

import java.util.ArrayList;

import es.tjkazeshop.app.beans.Pulsera;

public class ConcretePulserasFactory extends AbstractFactory<Pulsera, String> {
	String[] descripciones;
	Float[] precios;
	Integer[] stocks;
	String[] materiales;
	String[] disenhos;
	
	public ConcretePulserasFactory(String[] elements, String[] descripciones,
			Float[] precios, Integer[] stocks, String[] materiales, String[] disenhos) {
		super(elements, new ArrayList<Pulsera>());
		this.descripciones = descripciones;
		this.precios = precios;
		this.stocks = stocks;
		this.materiales = materiales;
		this.disenhos = disenhos;
	}

	protected  Pulsera getNextElement(int i) {
		return new Pulsera(elements[i], descripciones[i], precios[i], stocks[i], materiales[i], disenhos[i]);
	};
	
}
