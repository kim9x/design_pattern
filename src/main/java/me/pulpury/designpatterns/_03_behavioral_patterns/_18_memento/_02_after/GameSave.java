package me.pulpury.designpatterns._03_behavioral_patterns._18_memento._02_after;

import lombok.Getter;

@Getter
public class GameSave {
	
	private final int blueteamScore;
	
	private final int redTeamScore;

	public GameSave(int blueteamScore, int redTeamScore) {
		this.blueteamScore = blueteamScore;
		this.redTeamScore = redTeamScore;
	}
	
	

}
