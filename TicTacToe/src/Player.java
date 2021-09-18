
public class Player {
		private String type;
		private String winnerOrNot;

		public Player (String type){
			this.type = type;
		}

		public Player (){
			this.type = "";
			this.winnerOrNot = "notyet";
		}

		public void setP2BasedOn(Player player1){
			if (player1.type.equals("X")){
				this.type = "O";
			} else if (player1.type.equals("O")){
				this.type = "X";
			}
		}
		
		public void setP1(String type){
			if (type.equals("X")){
				this.type = "X";
			} else if (type.equals("O")){
				this.type = "O";
			}
		}
		
		public boolean isX() {
			if (!(this.type.equals("X"))) {
				return false;
			} else {
				return true;
			}
		}
		
		public void isWinner() {
			this.winnerOrNot = "is Winner";
		}
		
		public String whoWon() {
			if (this.isX()) {
				this.isWinner();
				System.out.println("PLAYER 1 WON THE GAME!");
				return "PLAYER 1 WON THE GAME!";
			} else {
				this.isWinner();
				System.out.println("PLAYER 2 WON THE GAME!");
				return "PLAYER 2 WON THE GAME!";
			}
		}
		
		public boolean isThereWinner() {
			if (this.winnerOrNot.equals("is Winner")) {
				return true;
			} else {
				return false;
			}
		}
		
		public char playerAsChar() {
			if (this.type.equals("X")) {
				return 'X';
			}
			
			return 'O';
		}
		
		public String toString() {
			return this.type;
		}
}
