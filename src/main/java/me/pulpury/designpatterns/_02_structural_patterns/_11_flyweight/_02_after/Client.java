package me.pulpury.designpatterns._02_structural_patterns._11_flyweight._02_after;

public class Client {
	
	public static void main(String[] args) {
		FontFactory fontFactory = new FontFactory();
		Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
	}

}
