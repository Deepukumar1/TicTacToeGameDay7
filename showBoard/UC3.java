package showBoard;

import java.util.Scanner;

public class UC3 {
	 static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        System.out.println("Welcome to Tic Tac Toe Game !!! :)");
	        System.out.println("Please Enter your name : ");
	        String playerName = scanner.nextLine();

	        char[] board = new char[10];
	        ticTacToeBoard.TicTacToeBoard ticTacToeGame = new ticTacToeBoard.TicTacToeBoard();
	        board = ticTacToeGame.creatingEmptyBoard(board);

	        char playerSymbol = ticTacToeGame.chooseLetter();
	        char computerSymbol;
	        if(playerSymbol == 'X')
	            computerSymbol = 'O';
	        else
	            computerSymbol = 'X';

	        System.out.println(playerName+"'s Symbol is : "+playerSymbol);
	        System.out.println("Computer's Symbol is : "+computerSymbol);

	        for(int i = 0; i < 10; i++){
	            // to make board visible on console
	            if(i != 0)
	                board[i] = '_';
	        }
	        ticTacToeGame.showBoard(board);

}
	    // UC3 Problem - Prints Tic Tac Toe board on console
	    public void showBoard(char[] board){
	        System.out.println("Current Board looks like : \n");
	        int i = 1;
	        while(i < 10){
	            System.out.println(board[i]+" "+board[i+1]+" "+board[i+2]);
	            i = i+3;
	        }
	        System.out.println();


	    }

}
