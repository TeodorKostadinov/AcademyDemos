package game_logic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ui.BoardScreen;
import ui.EndScreen;

public class ButtonListener implements ActionListener {

	private int x;
	private int y;
	private Board board;
	private int player;
	private JButton btn;
	private BoardScreen screen;

	public ButtonListener(int x, int y, 
			int player, Board board, 
			JButton btn, BoardScreen screen) {
		this.x = x;
		this.y = y;
		this.player = player;
		this.btn = btn;
		this.board = board;
		this.screen = screen;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int result = board.dropBomb(x, y, player);
		int[][] playerResult = {{x,y},{result}};
		screen.update(playerResult, Board.PLAYER_ONE);
		
		
		int[][] aiResult = board.makeAImove();
		screen.update(aiResult, Board.PLAYER_TWO);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
