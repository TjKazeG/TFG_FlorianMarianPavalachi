package es.tjkazeshop.app.factory;

import java.util.ArrayList;

import es.tjkazeshop.app.beans.Reloj;

public class ConcreteRelojFactory extends AbstractFactory<Reloj, String> {
	String[] descripciones;
	Float[] precios;
	Integer[] stocks;
	String[] marcas;
	String[] tipos;
	
	public ConcreteRelojFactory(String[] elements, String[] descripciones, Float[] precios,
			Integer[] stocks, String[] marcas, String[] tipos) {
		super(elements, new ArrayList<Reloj>());
		this.descripciones = descripciones;
		this.precios = precios;
		this.stocks = stocks;
		this.marcas = marcas;
		this.tipos = tipos;
	}

	protected  Reloj getNextElement(int i) {
		return new Reloj(elements[i], descripciones[i], precios[i], stocks[i], marcas[i], tipos[i]);
	};
	
}
