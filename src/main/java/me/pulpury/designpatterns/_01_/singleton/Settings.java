package me.pulpury.designpatterns._01_.singleton;

public class Settings {
	
	// 방법 3 사용 시 
	// java 1.5 버전 이상부턴
	// volatile 키워드를 사용해줘야
	// double checked locking 기법 적용 가능
//	private static volatile Settings instance;
	
	// Thread safe 방법2
	// 이른 초기화(eager initialization) 사용하기
	// final 변수는 대문자로 사용하는 것이 규약이다.
	// 무조건 초기화를 해주는 과정이 단점이 될 수 있다.
	// 비용을 많이 들여 초기화를 해놨는데
	// 사용하지 않을 수도 있기 때문.
//	private static final Settings INSTANCE = new Settings();
	
	private Settings() {}
	
	// Thread safe 방법4
	// static inner 클래스 사용하기
	private static class SettingsHolder {
		private static final Settings INSTANCE = new Settings();
	}
	
	// Thread safe 방법1
	// synchronized 키워드 사용
	// nut 성능이 떨어질 수 있다.
	public static synchronized Settings getInstance() {
		
		// 방법 2 사용 시 INSTANCE를 바로 반환해주면 된다.
//		if (instance == null) {
//			instance = new Settings();
//		}
//		
//		return instance;
		
		// 아래가 방법 2 사용 시 바로 반환하는 return 
//		return INSTANCE;
		
		// Thread safe 방법 3
		// double checked locking 사용하기
//		if (instance == null) {
//			synchronized (Settings.class) {
//				if (instance == null) {
//					instance = new Settings();
//				}
//				
//			}
//		}
//		return instance;
		
		// Tread safe 방법4
		// 가장 권장하는 방법 중에 하나!
		return SettingsHolder.INSTANCE;
		
		
	}

}
