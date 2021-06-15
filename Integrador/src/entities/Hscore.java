package entities;

public class Hscore {

	// ATENCAO: Hscore15, Hscore30 e Hscore60 HERDAM desta classe

	protected String playerUsername;
	
	protected long playerScore;
	
	protected double time;
	
	protected double averageCps;
	
	
	
	// construtor vazio
	public Hscore() {
		
		this.playerUsername = "";
		
		this.playerScore = 0;
		
		this.time = 0.0;
		
		this.averageCps = 0.0;
		
	}

	
	// construtor com parametros
	public Hscore(String player_name, long player_score, double time, double averageCps) {
		
		this.playerUsername = player_name;
		
		this.playerScore = player_score;
		
		this.time = time;
		
		this.averageCps = averageCps;
		
	}

	
	//metodo toString
	@Override
	public String toString() {
		
		return "[playerName = " + playerUsername + ", playerScore = " + playerScore + ", time = " + time + ", averageCps = "
				+ averageCps;
		
	}

	
	// getters e setters
	public String getPlayerName() {
		
		return playerUsername;
		
	}

	public void setPlayerName(String player_name) {
		
		this.playerUsername = player_name;
		
	}

	public long getPlayerScore() {
		
		return playerScore;
		
	}

	public void setPlayerScore(long player_score) {
		
		this.playerScore = player_score;
		
	}

	public double getTime() {
		
		return time;
		
	}

	public void setTime(double time) {
		
		this.time = time;
		
	}
	
	public double getAverageCps() {
		
		return averageCps;
		
	}

	public void setAverageCps(double averageCps) {
		
		this.averageCps = averageCps;
		
	}

	
}
