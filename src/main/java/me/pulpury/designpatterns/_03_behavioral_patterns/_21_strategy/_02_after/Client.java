package me.pulpury.designpatterns._03_behavioral_patterns._21_strategy._02_after;

public class Client {
	
	public static void main(String[] args) {
//		BlueLightRedLight game = new BlueLightRedLight(new Normal());
//		game.blueLight();
//		game.redLight();
		
		BlueLightRedLight game = new BlueLightRedLight();
		game.blueLight(new Normal());
		game.redLight(new Faster());
		game.blueLight(new Speed() {
			
			@Override
			public void redLight() {
				// TODO Auto-generated method stub
				System.out.println("blue light");
				
			}
			
			@Override
			public void blueLight() {
				// TODO Auto-generated method stub
				System.out.println("red light");
			}
		});
	}

}
