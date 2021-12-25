package me.pulpury.designpatterns._01_.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Settings settings = Settings.getInstance();
//		Settings settings1 = Settings.getInstance();
		Settings settings1 = null;
		
		
		// 파일 등에 저장할 때 사용하는 직렬화
		// 불러올 때 사용한는 역직렬화 사용 시
		// 동일 객체가 아닐 수 있다.
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
			out.writeObject(settings);
		}
		
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
			settings1 = (Settings) in.readObject();
		}
		
		System.out.println(settings == settings1);
		
		// 아래처럼 리플렉션 사용 시 new로 해서 사용하는 것과 같다.
		// Thread safe가 깨진다.
//		Constructor<Settings> constructor = Settings.class.getDeclaredConstructors();
//		constructor.setAccessible(true);
//		Settings settings1 = constructor.newInstance();
//		
//		System.out.println(settings == settings1);
	}

}
