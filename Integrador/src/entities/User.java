package entities;

public class User implements Authenticate {

	private long idUser;	
	private String name;	
	private long nclicks;	
	private long points;	
	private String username;	
	private String password;	
	private String picture;

	// relacionamento 1:N com hscore15, 30 e 60
	private long id15;	
	private long id30;	
	private long id60;
	
	// Construtor vazio
	public User() {
		this.idUser = 0;
		this.name = "";
		this.nclicks = 0;
		this.points = 0;
		this.username = "";
		this.password = "";
		this.picture = "";
		this.id15 = 0;
		this.id30 = 0;
		this.id60 = 0;
	}
	
	// Construtor com parametros
	public User(long id_user, String name, long nclicks, long points, String username, String password, String picture,
			Hscore15 score15, Hscore30 score30, Hscore60 score60, long id15, long id30, long id60) {
		this.idUser = id_user;
		this.name = name;
		this.nclicks = nclicks;
		this.points = points;
		this.username = username;
		this.password = password;
		this.picture = picture;
		this.id15 = id15;
		this.id30 = id30;
		this.id60 = id60;
	}

	// metodo toString
	@Override
	public String toString() {
		return "User [idUser = " + idUser + ", name = " + name + ", nclicks = " + nclicks + ", points = " + points
				+ ", username = " + username + ", password = " + password + ", picture = " + picture + ", id15 = "
				+ id15 + ", id30 = " + id30 + ", id60 = " + id60 + "]";
	}

	@Override
	public boolean authPassword(String password) {
		if (this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	// getters e setters
	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long id_user) {
		this.idUser = id_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNclicks() {
		return nclicks;
	}

	public void setNclicks(long nclicks) {
		this.nclicks = nclicks;
	}

	public long getPoints() {
		return points;
	}

	public void setPoints(long points) {
		this.points = points;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public long getId15() {
		return id15;
	}

	public void setId15(long id15) {
		this.id15 = id15;
	}

	public long getId30() {
		return id30;
	}

	public void setId30(long id30) {
		this.id30 = id30;
	}

	public long getId60() {
		return id60;
	}

	public void setId60(long id60) {
		this.id60 = id60;
	}
}
