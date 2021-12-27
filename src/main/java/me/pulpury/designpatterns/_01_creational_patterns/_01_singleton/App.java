package me.pulpury.designpatterns._01_creational_patterns._01_singleton;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// 아래처럼 사용하면 reflection에도 안전하다. 
		Settings settings = Settings.INSTANCE;
//		Settings settings1 = Settings.getInstance();
//		
//		System.out.println(settings == settings1);
	}

}
