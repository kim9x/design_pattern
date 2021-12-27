package me.pulpury.designpatterns._01_creational_patterns._02_factory_method._02_after;

/**
 * 자바 8버전 이하를 쓰고 있다면
 * 아래처럼 추상클래스를 이용하여 팩토리 메서드 패턴을
 * 만들어야한다.
 * @author TJ Kim
 *
 */
public abstract class DefaultShipFactory implements ShipFactory {

	@Override
	public void sendEmailTo(String email, Ship ship) {
		System.out.println(ship.getName() + " 다 만들었습니다.");
	}
}
