package entities;

import java.util.ArrayList;
import java.util.List;

public class Hscore60 extends Hscore {

	private long id60;
	
	// relacionamento 1:N com User
	private List<User> user;

	
	// construtor vazio
	public Hscore60() {
		super();
		
		this.id60 = 0;
		
		this.user = new ArrayList<User>();
		
	}

	
	// construtor com parametros
	public Hscore60(String player_name, long player_score, double time, double averageCps, long id60, List<User> user) {
		this.playerName = player_name;
		
		this.playerScore = player_score;
		
		this.time = time;
		
		this.averageCps = averageCps;
		
		this.id60 = id60;
		
		this.user = user;
		
	}

	
	// metodo toString
	@Override
	public String toString() {
		return "Hscore15 [playerName = " + playerName + ", playerScore = " + playerScore + ", time = " + time + ", averageCps = "
				+ averageCps +", id60 = " + id60 + ", user = " + user + "]";
	}

	
	// getters e setters
	public long getId60() {
		return id60;
	}

	public void setId60(long id60) {
		this.id60 = id60;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

}
