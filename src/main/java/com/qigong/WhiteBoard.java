package com.qigong;

import java.util.HashSet;
import java.util.Set;

class Store {
	final private int x;
	final private int y;

	Store(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return this.x;
	}

	int getY() {
		return this.y;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Store) {
			Store store = (Store)other;
			return x == store.getX() && y == store.getY();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return x * 10000 + y;
	}
}

public class WhiteBoard {
	private int currentX;
	private int currentY;
	private Set<Store> visited;

	public WhiteBoard() {
		currentX = 0;
		currentY = 0;
		visited = new HashSet<Store>();
		visited.add(new Store(currentX, currentY));
	}

	public void go(String direction) {
		if ("north".equalsIgnoreCase(direction)) {
			currentY += 1;
		} else if ("south".equalsIgnoreCase(direction)) {
			currentY -= 1;
		} else if ("east".equalsIgnoreCase(direction)) {
			currentX += 1;
		} else if ("west".equalsIgnoreCase(direction)) {
			currentX -= 1;
		} else {
			return;
		}
		Store current = new Store(currentX, currentY);
		if (!visited.contains(current)) {
			visited.add(current);
			System.out.println("Store Added");
		}
	}

	public int getNumber() {
		return visited.size();
	}
}
