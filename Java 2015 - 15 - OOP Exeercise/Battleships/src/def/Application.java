package def;

import ui.BoardScreen;
import game_logic.Board;

public class Application {

	public static void main(String[] args) {
		Board board = new Board(8, 4);
		board.setShips();
		BoardScreen screen = new BoardScreen(board);
		screen.setVisible(true);
	}

}
