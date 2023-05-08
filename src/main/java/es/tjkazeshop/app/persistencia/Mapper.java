package es.tjkazeshop.app.persistencia;

public interface Mapper <T,H> {
	public T map(H h);
}

