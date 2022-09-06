package allowPlayer;

import java.util.Scanner;
import ticTacToeBoard.TicTacToeBoard;

public class ChooseLetter {
	
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game !!! :)");
        System.out.println("Please Enter your name : ");
        String playerName = scanner.nextLine();

        char[] board = new char[10];
        TicTacToeBoard ticTacToeGame = new TicTacToeBoard();
        board = ticTacToeGame.creatingEmptyBoard(board);

        char playerSymbol = ticTacToeGame.chooseLetter();
        char computerSymbol;
        if(playerSymbol == 'X')
            computerSymbol = 'O';
        else
            computerSymbol = 'X';

        System.out.println(playerName+"'s Symbol is : "+playerSymbol);
        System.out.println("Computer's Symbol is : "+computerSymbol);

}
    //UC2 Problem - taking input from user to choose either X or O
    public char chooseLetter(){
        System.out.println("Please select letter either 'X' or 'O' ");
        char symbol = scanner.next().charAt(0);
        if(symbol == 'X' || symbol == 'O') {
            System.out.println("You selected the letter !!!");
        }else {
            System.out.println("Invalid Input !!!");
            symbol = chooseLetter();
        }
        return symbol;
    }

}
