import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		
		System.out.println("Player 1, choose X or O.");
		// Players 1 and 2 are chosen
		while (true) {
			String type = scanner.nextLine();
			if (type.equals("X") || type.equals("O")) {
				p1.setP1(type);
				p2.setP2BasedOn(p1);
				System.out.println("Player 1 is: " + p1 + " \nPlayer 2 is: " + p2);
				System.out.println();
				break;
			} else {
				System.out.println("Must choose X or O!");
				continue;
			}
		}
		
		
		// Game board
		char[][] board = { {'1', '|', '2', '|', '3'}, 
				{'-', '-', '-', '-', '-'},
				{'4', '|', '5', '|', '6'}, 
				{'-', '-', '-', '-', '-'},
				{'7', '|', '8', '|', '9'} };
		
		
		System.out.println("Player 1, pick your position! (1-9)");
		printBoard(board);
		int position = Integer.valueOf(scanner.nextLine());
		choosePosition(p1, board, position);
		printBoard(board);
		
		System.out.println("Player 2's Turn");
		position = Integer.valueOf(scanner.nextLine());
		choosePosition(p2, board, position);
		printBoard(board);
		
		System.out.println("Player 1's Turn");
		position = Integer.valueOf(scanner.nextLine());
		choosePosition(p1, board, position);
		printBoard(board);
		
		System.out.println("Player 2's Turn");
		position = Integer.valueOf(scanner.nextLine());
		choosePosition(p2, board, position);
		printBoard(board);
		chooseWinner(p1, board);
		
		System.out.println("Player 1's Turn");
		position = Integer.valueOf(scanner.nextLine());
		choosePosition(p1, board, position);
		printBoard(board);
		chooseWinner(p1, board);
		
		
	}
	
	// returns gameboard
	public static void printBoard(char[][] board) {
		System.out.println();
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print(board[row][col]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// position of the play is picked
	public static void choosePosition(Player player, char[][] gameboard, int position) {
		while (true) {
			if (position > 0 && position <= 9) {
				if (position == 1) {
					gameboard[0][0] = player.playerAsChar();
				} else if (position == 2) {
					gameboard[0][2] = player.playerAsChar();
				}else if (position == 3) {
					gameboard[0][4] = player.playerAsChar();
				}else if (position == 4) {
					gameboard[2][0] = player.playerAsChar();
				}else if (position == 5) {
					gameboard[2][2] = player.playerAsChar();
				}else if (position == 6) {
					gameboard[2][4] = player.playerAsChar();
				}else if (position == 7) {
					gameboard[4][0] = player.playerAsChar();
				}else if (position == 8) {
					gameboard[4][2] = player.playerAsChar();
				}else {
					gameboard[4][4] = player.playerAsChar();
				}
				
				break;
			} else {
				System.out.println("Invalid input.");
				continue;
			}
		}
	}
	
	public static void chooseWinner(Player p1, char[][] gameboard) {
			//horizontal row1
		if ((gameboard[0][0] == 'X') && (gameboard[0][2] == 'X') && (gameboard[0][4] == 'X')) {
			if (p1.isX()) {
				System.out.println("PLAYER 1 WON THE GAME!");
			} else {
				System.out.println("PLAYER 2 WON THE GAME!");
			}
			
			// horizontal row2
		} else if ((gameboard[2][0] == 'X') && (gameboard[2][2] == 'X') && (gameboard[2][4] == 'X')) {
			p1.whoWon();
			// horizontal row3
		} else if ((gameboard[4][0] == 'X') && (gameboard[4][2] == 'X') && (gameboard[4][4] == 'X')) {
			p1.whoWon();
			//vertical column1
		} else if ((gameboard[0][0] == 'X') && (gameboard[2][0] == 'X') && (gameboard[4][0] == 'X')) {
			p1.whoWon();
			//vertical column2
		} 	else if ((gameboard[0][2] == 'X') && (gameboard[2][2] == 'X') && (gameboard[4][2] == 'X')) {
			p1.whoWon();
			//vertical column3
		} else if ((gameboard[0][4] == 'X') && (gameboard[2][4] == 'X') && (gameboard[4][4] == 'X')) {
			p1.whoWon();
			//diagonal 1
		} else if ((gameboard[0][0] == 'X') && (gameboard[2][2] == 'X') && (gameboard[4][4] == 'X')) {
			p1.whoWon();
		} else {
			p1.whoWon();
		}
	}
}
