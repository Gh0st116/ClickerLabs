package entities;

public class Badge {

	private Long idBadge;
	private Long pointsValue;
	private String name;
	private String description;
	
	// relacionamento 1:N com User
	private User user;
	
	
	// Construtor vazio
	public Badge() {
		this.idBadge = null;
		
		this.pointsValue = null;
		
		this.name = "";
		
		this.description = "";
		
		this.user = null;
		
	}

	
	// Construtor com parametros
	public Badge(Long id_badge, Long pointsValue, String name, String description, User user) {
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
	public Long getIdBadge() {
		return idBadge;
	}

	public void setIdBadge(Long id_badge) {
		this.idBadge = id_badge;
	}

	public Long getPointsValue() {
		return pointsValue;
	}

	public void setPointsValue(Long pointsValue) {
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