package entities;

public class Badge {

	private long idBadge;
	private long pointsValue;
	private String name;
	private String description;
	
	// relacionamento 1:N com User
	private User user;
	
	
	// Construtor vazio
	public Badge() {
		this.idBadge = 0;
		
		this.pointsValue = 0;
		
		this.name = "";
		
		this.description = "";
		
		this.user = null;
		
	}

	
	// Construtor com parametros
	public Badge(long id_badge, long pointsValue, String name, String description, User user) {
		this.idBadge = id_badge;
		
		this.pointsValue = pointsValue;
		
		this.name = name;
		
		this.description = description;
		
		this.user = user;
		
	}

	
	// metodo toString
	@Override
	public String toString() {
		return "Badge [idBadge = " + idBadge + ", pointsValue = " + pointsValue + ", name = " + name + ", description = "
				+ description + ", user = " + user + "]";
	}
	

	// getters e setters
	public long getIdBadge() {
		return idBadge;
	}

	public void setIdBadge(long id_badge) {
		this.idBadge = id_badge;
	}

	public long getPointsValue() {
		return pointsValue;
	}

	public void setPointsValue(long pointsValue) {
		this.pointsValue = pointsValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}