 package me.pulpury.designpatterns._03_behavioral_patterns._14_command._02_after;

import me.pulpury.designpatterns._03_behavioral_patterns._14_command._01_before.Game;
import me.pulpury.designpatterns._03_behavioral_patterns._14_command._01_before.Light;

public class GameEndCommand implements Command {
	
	private Game game;
	
	public GameEndCommand(Game game) {
		this.game = game;
	}
	
	@Override
	public void execute() {
		game.end();
	}

	@Override
	public void undo() {
		new GameStartCommand(this.game).execute();
	}

}
