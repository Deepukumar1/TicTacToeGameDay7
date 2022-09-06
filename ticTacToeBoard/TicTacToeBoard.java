package ticTacToeBoard;

public class TicTacToeBoard {
	
	public static void main(String[] args) {
	    System.out.println("Welcome to Tic Tac Toe Game !!! :)");
	    char[] board = new char[10];
	    TicTacToeBoard ticTacToeGame = new TicTacToeBoard();
	    board = ticTacToeGame.creatingEmptyBoard(board);
	}

	//UC1 Problem
	public char[] creatingEmptyBoard(char[] board){
	    for (int i = 0; i < 10; i++){
	        if(i == 0){
	            continue;
	        }else {
	            board[i] = ' ';
	        }
	    }
	    System.out.println("Currently No one is Playing");
	    return board;
	}

	public char chooseLetter() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void showBoard(char[] board) {
		// TODO Auto-generated method stub
		
	}

	public void getUserPosition(char playerSymbol, char[] board) {
		// TODO Auto-generated method stub
		
	}

	public void flipCoin(String playerName) {
		// TODO Auto-generated method stub
		
	}

	public char chooseLetter(String player1Name) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean flipCoin(String player1Name, String player2Name) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean gamePlay(boolean flag, char playerSymbol, char[] board) {
		// TODO Auto-generated method stub
		return false;
	}

	public char playerHasWon(char[] board) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean boardIsFull(char[] board) {
		// TODO Auto-generated method stub
		return false;
	}

}



