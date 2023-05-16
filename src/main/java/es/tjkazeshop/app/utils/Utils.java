package es.tjkazeshop.app.utils;

import java.util.List;
import java.util.Random;

public class Utils {
	public static long getRandomIDbyList(List<Long> list) {
		return list.get(new Random().nextInt(list.size()));
	}
}
