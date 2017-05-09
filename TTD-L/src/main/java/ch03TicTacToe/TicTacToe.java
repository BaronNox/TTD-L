package ch03TicTacToe;

public class TicTacToe
{
	private Character[][] board = { {'\0', '\0', '\0'},
									{'\0', '\0', '\0'},
									{'\0', '\0', '\0'} };
	
	public void play(int x, int y) {
		checkAxis(x);
		checkAxis(y);
		setBox(x, y);
	}
	
	private void checkAxis(int v) {
		if(v < 1 || v > 3) {
			throw new RuntimeException("X is outside board.");
		}
	}
	
	private void setBox(int x, int y) {
		if(board[x - 1][y - 1] != '\0') {
			throw new RuntimeException("Box is occupied.");
		} else {
			board[x - 1][y - 1] = 'X';
		}
	}
}
