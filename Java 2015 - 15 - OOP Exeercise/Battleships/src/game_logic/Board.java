package game_logic;

import java.util.Random;

public class Board {

	public final static int PLAYER_ONE = 156;
	public static final int PLAYER_TWO = 896;

	public static final int CELL_EMPTY = 0;
	public static final int CELL_SHIP = 1;
	public static final int CELL_DESTROYED = -1;
	
	public static final int RES_PLAYER_TWO_WIN = 222;
	public static final int RES_PLAYER_ONE_WIN = 111;
	public static final int RES_MISS = 555;
	public static final int RES_HIT = 666;
	
	private int[][] boardOne;
	private int[][] boardTwo;
	
	public Board(int width, int height) {
		this.boardOne = new int[width][height];
		this.boardTwo = new int[width][height];
	}

	public int getHeight() {
		return boardOne[0].length;
	}
	
	public int getWidth() {
		return boardOne.length;
	}

	public int dropBomb(int x, int y, int player) {
		if(player == PLAYER_ONE) {
			if(this.boardOne[x][y] == CELL_SHIP) {
				this.boardOne[x][y] = CELL_DESTROYED;
				return countScore(CELL_DESTROYED);
			}
		} else {
			if(this.boardTwo[x][y] == CELL_SHIP) {
				this.boardTwo[x][y] = CELL_DESTROYED;
				return countScore(CELL_DESTROYED);
			}
		}
		return countScore(CELL_EMPTY);
	}

	private int countScore(int cellEmpty) {
		boolean p1Alive = false;
		boolean p2Alive = false;
		for (int i = 0; i < boardOne.length; i++) {
			for (int j = 0; j < boardOne[0].length; j++) {
				if(boardOne[i][j] == CELL_SHIP) {
					p1Alive = true;
					break;
				}
			}
		}
		for (int i = 0; i < boardTwo.length; i++) {
			for (int j = 0; j < boardTwo[0].length; j++) {
				if(boardTwo[i][j] == CELL_SHIP) {
					p2Alive = true;
					break;
				}
			}
		}
		
		if(!p1Alive) return RES_PLAYER_TWO_WIN;
		if(!p2Alive) return RES_PLAYER_ONE_WIN;
		if(cellEmpty == CELL_DESTROYED) return RES_HIT;
		return RES_MISS;
	}

	public void setShips() {
		for (int i = 0; i < 3; i++) {
			Random rnd = new Random();
			int shipLenght = rnd.nextInt(3) + 2;
			setShip(shipLenght, boardOne);
			setShip(shipLenght, boardTwo);
		}
		
	}

	public boolean hasShip(int x, int y, int player) {
		if(player == PLAYER_ONE) {
			if(boardOne[x][y] == CELL_SHIP) return true;
		}
		if(player == PLAYER_TWO) {
			if(boardTwo[x][y] == CELL_SHIP) return true;
		}
		return false;
	}
	
	private void setShip(int i, int[][] board) {
		Random rnd = new Random();
		int startX = rnd.nextInt(board.length);
		int startY = rnd.nextInt(board[0].length);
		
		while(startX + i > board.length &&
				startY + i > board[0].length) {
			startX = rnd.nextInt(board.length);
			startY = rnd.nextInt(board[0].length);
		}
		
		if(startX + i < board.length) {
			for (int j = startX; j < startX + i; j++) {
				board[j][startY] = CELL_SHIP;
			}
		} else {
			for (int j = startY; j < startY + i; j++) {
				board[startX][j] = CELL_SHIP;
			}
		}
	}

	public int[][] makeAImove() {
		Random rnd = new Random();
		int x = rnd.nextInt(getWidth());
		int y = rnd.nextInt(getHeight());
		int result = dropBomb(x, y, PLAYER_TWO);
		
		return new int[][] {{x,y}, {result}};
	}
}
