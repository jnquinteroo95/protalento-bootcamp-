package main;

import collections.CustomCollections;

public class Main {

	public static void main(String[] args) {

		CustomCollections<String> cc = new CustomCollections<String>(5);
		cc.add("Nicolas");
		cc.add("Daniela");
		cc.addS(2, "Cristina");
		cc.set(2, "Luisa");
		cc.remove(2);
		cc.mostrar();

	}
}
