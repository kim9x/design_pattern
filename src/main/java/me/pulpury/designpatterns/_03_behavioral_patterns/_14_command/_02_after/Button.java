package me.pulpury.designpatterns._03_behavioral_patterns._14_command._02_after;

import me.pulpury.designpatterns._03_behavioral_patterns._14_command._01_before.Game;
import me.pulpury.designpatterns._03_behavioral_patterns._14_command._01_before.Light;

public class Button {
	
	private Command command;
	
	public Button(Command command) {
		this.command = command; 
	}
	
	public void press() {
		command.execute();
	}
	
	public static void main(String[] args) {
//		Button button = new Button(new LightOnCommand(new Light()));
		Button button = new Button(new GameStartCommand(new Game()));
		button.press();
		button.press();
	}

}
