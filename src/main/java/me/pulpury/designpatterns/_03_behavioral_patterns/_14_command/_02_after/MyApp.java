package me.pulpury.designpatterns._03_behavioral_patterns._14_command._02_after;

import me.pulpury.designpatterns._03_behavioral_patterns._14_command._01_before.Game;
import me.pulpury.designpatterns._03_behavioral_patterns._14_command._01_before.Light;

public class MyApp {
	
	private Command command;
	
	public MyApp(Command command) {
		this.command = command;
	}
	
	public void press() {
		command.execute();
	}
	
	public static void main(String[] args) {
		MyApp myApp = new MyApp(new LightOffCommand(new Light()));
//		MyApp myApp = new MyApp(new GameEndCommand(new Game()));
		myApp.press();
		myApp.press();
	}

}
