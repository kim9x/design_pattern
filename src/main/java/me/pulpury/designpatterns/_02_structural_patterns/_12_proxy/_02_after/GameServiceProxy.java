package me.pulpury.designpatterns._02_structural_patterns._12_proxy._02_after;


public class GameServiceProxy implements GameService {
	
	private GameService gameService;

//	public GameServiceProxy(GameService gameService) {
//		this.gameService = gameService;
//	}

	@Override
	public void startGame() {
		 long before = System.currentTimeMillis();
		 // 아래처럼 구현하면 위의 생성자가 필요 없다.
		 // lazy initialization
		 if (this.gameService == null) {
			  this.gameService = new DefaultGameService();
		 }
		 gameService.startGame();
		 System.out.println(System.currentTimeMillis() - before);
	}
}
