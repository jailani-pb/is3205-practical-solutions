package question1;

public class Game {

	public String gameName;
	private String player1;
	private String player2;
	private int numberOfRounds;
	private String[] winnerNames;
	private int[] player1Numbers;
	private int[] player2Numbers;

	public Game(String gameName, String player1, String player2, int numberOfRounds) {
		this.gameName = gameName;
		setPlayer1(player1);
		setPlayer2(player2);
		setNumberOfRounds(numberOfRounds);
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		if(player1 != null && !player1.equals("") && !player1.equalsIgnoreCase(player2)) {
			this.player1 = player1;
		} else {
			this.player1 = "Player 1";
		}
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
			if(player2 != null && !player2.equals("") && !player2.equalsIgnoreCase(player1)) {
				this.player2 = player2;
			} else {
				this.player2 = "Player 2";
			}
	}

	public int getNumberOfRounds() {
		return numberOfRounds;
	}

	public void setNumberOfRounds(int numberOfRounds) {
		this.numberOfRounds = numberOfRounds;
		if(this.numberOfRounds < 1) {
			this.numberOfRounds = 1;
		}
		winnerNames = new String[this.numberOfRounds];
		player1Numbers = new int[this.numberOfRounds];
		player2Numbers = new int[this.numberOfRounds];
	}

	public void play() {
		int player1Number = 0;
		int player2Number = 0;
		for(int i = 0; i < numberOfRounds; i++) {
			player1Number = (int) (Math.random() * 10);
			player2Number = (int) (Math.random() * 10);
			if(player1Number < player2Number) {
				winnerNames[i] = player2;
			} else if (player1Number > player2Number) {
				winnerNames[i] = player1;
			} else {
				winnerNames[i] = "draw";
			}
			player1Numbers[i] = player1Number;
			player2Numbers[i] = player2Number;
		}
	}

	public String getWinnerName(int index) {
		if(index >= 0 && index < winnerNames.length) {
			return winnerNames[index];
		}
		return null;
	}

	public int getPlayer1Number(int index) {
		if(index >= 0 && index < player1Numbers.length) {
			return player1Numbers[index];
		}
		return -1;
	}

	public int getPlayer2Number(int index) {
		if(index >= 0 && index < player2Numbers.length) {
			return player2Numbers[index];
		}
		return -1;
	}

}
