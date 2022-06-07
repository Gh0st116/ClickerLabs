package entities;

import java.util.ArrayList;
import java.util.List;

public class Hscore30 extends Hscore {

	private Long id30;
	
	// relacionamento 1:N com User
	private List<User> user;	
	
	// construtor vazio
	public Hscore30() {
		super();		
		this.id30 = null;		
		this.user = new ArrayList<User>();		
	}
	
	// construtor com parametros
	public Hscore30(String player_name, Long player_score, double time, double averageCps, Long id30, List<User> user) {
		this.playerUsername = player_name;		
		this.playerScore = player_score;
		this.time = time;		
		this.averageCps = averageCps;		
		this.id30 = id30;		
		this.user = user;		
	}
	
	// metodo toString
	@Override
	public String toString() {
		return "Hscore30 [playerUserame = " + playerUsername + ", playerScore = " + playerScore + ", time = " + time + ", averageCps = "
				+ averageCps +", id30 = " + id30 + ", user = " + user + "]";
	}	
	
	// getters e setters
	public Long getId30() {
		return id30;
	}

	public void setId30(Long id30) {
		this.id30 = id30;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
}
