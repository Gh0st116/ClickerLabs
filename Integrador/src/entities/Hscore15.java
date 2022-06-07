package entities;

import java.util.ArrayList;
import java.util.List;

public class Hscore15 extends Hscore {

	private Long id15;
	
	// relacionamento 1:N com User
	private List<User> user;
		
	// construtor vazio
	public Hscore15() {
		super();		
		this.id15 = null;		
		this.user = new ArrayList<User>();		
	}
	
	// construtor com parametros
	public Hscore15(String player_name, Long player_score, double time, double averageCps, Long id15, List<User> user) {
		this.playerUsername = player_name;		
		this.playerScore = player_score;		
		this.time = time;		
		this.averageCps = averageCps;		
		this.id15 = id15;		
		this.user = user;		
	}
	
	// metodo toString
	@Override
	public String toString() {
		return "Hscore15 [playerUsername = " + playerUsername + ", playerScore = " + playerScore + ", time = " + time + ", averageCps = "
				+ averageCps +", id15 = " + id15 + ", user = " + user + "]";
	}	

	// getters e setters
	public Long getId15() {
		return id15;
	}

	public void setId15(Long id15) {
		this.id15 = id15;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
}
