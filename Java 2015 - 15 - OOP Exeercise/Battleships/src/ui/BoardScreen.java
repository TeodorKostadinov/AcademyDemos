package ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game_logic.Board;
import game_logic.ButtonListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoardScreen extends JFrame {

	private Board board;
	private JButton[][] btns;
	private JButton[][] myBtns;

	public BoardScreen(Board board) {
		this.board = board;
		this.btns = new JButton[board.getWidth()][board.getHeight()];
		this.myBtns = new JButton[board.getWidth()][board.getHeight()];

		JPanel newPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;
		newPanel.add(new JLabel("Player 1"), constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		JPanel boardOne = getBoard(Board.PLAYER_ONE);
		newPanel.add(boardOne, constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		newPanel.add(new JLabel("Player 2"), constraints);

		constraints.gridx = 0;
		constraints.gridy = 3;
		JPanel boardTwo = getBoard(Board.PLAYER_TWO);
		newPanel.add(boardTwo, constraints);

		this.add(newPanel);
		pack();

		setLocationRelativeTo(null);
	}

	private JPanel getBoard(int player) {
		JPanel newPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 10, 10);

		for (int i = 0; i < board.getHeight(); i++) {
			for (int j = 0; j < board.getWidth(); j++) {
				JButton btn = new JButton("  ");
				btn.addActionListener(new ButtonListener(j, i, player, board,
						btn, this));
				constraints.gridx = j;
				constraints.gridy = i;

				if (board.hasShip(j, i, player)) {
					btn.setBackground(Color.BLUE);
				}
				if (player == Board.PLAYER_ONE) {
					myBtns[j][i] = btn;
				} else {
					btns[j][i] = btn;
				}
				newPanel.add(btn, constraints);
			}
		}

		return newPanel;
	}

	public void update(int[][] update, int player) {
		JButton btn;
		if (player == Board.PLAYER_TWO) {
			btn = btns[update[0][0]][update[0][1]];
		} else {
			btn = myBtns[update[0][0]][update[0][1]];
		}
		int result = update[1][0];
		if (result == Board.RES_HIT) {
			btn.setBackground(Color.RED);
			btn.setEnabled(false);
		} else if (result == Board.RES_MISS) {
			btn.setBackground(Color.BLACK);
			btn.setEnabled(false);
		} else {
			new EndScreen("WIN WIN").setVisible(true);
		}
	}
}
