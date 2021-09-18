
public class Player {
		private String type;

		public Player (String type){
			this.type = type;
		}

		public Player (){
			this.type = "";
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
		
		public boolean isO() {
			if (this.type.equals("O")) {
				return true;
			}
			
			return false;
		}
		
		public String whoWon() {
			if (this.isX()) {
					return "PLAYER 1 WON THE GAME!";
			} else {
				return "PLAYER 2 WON THE GAME!";
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
