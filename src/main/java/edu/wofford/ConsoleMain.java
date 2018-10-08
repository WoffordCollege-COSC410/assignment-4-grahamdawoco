package edu.wofford;

import java.util.Scanner;

public class ConsoleMain {
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		TicTacToeModel game = new TicTacToeModel();
		String[] userInput = new String[2];
		System.out.println(game.toString());
		while(game.getResult() == TicTacToeModel.Result.NONE){
			int row = keyboard.nextInt();
			int col = keyboard.nextInt();
			game.setMarkAt(row,col);
			System.out.println(game.toString());
		}
		if(game.getResult() == TicTacToeModel.Result.XWIN){
			System.out.println("X wins");}
		else if(game.getResult() == TicTacToeModel.Result.OWIN){
			System.out.println("O wins");}
		else if(game.getResult() == TicTacToeModel.Result.TIE){
			System.out.println("Tie");}
	}
}

//what is this board object
//why do three files take input from the command line
//what is the general objective of consolemain and main
//what is entered into the command line
//how is console tested