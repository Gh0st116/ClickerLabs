package entities;



public class Friend {

	private Long idFriend;
	
	private String name;
	
	private Long fpoints;
	
	private String picture;
	
	private Long score15;
	
	private Long score30;
	
	private Long score60;
	
	private Long pos15;
	
	private Long pos30;
	
	private Long pos60;

	
	// Construtor vazio
	public Friend() {
		this.idFriend = null;
		
		this.name = "";
		
		this.fpoints = null;
		
		this.picture = "";
		
		this.score15 = null;
		
		this.score30 = null;
		
		this.score60 = null;
		
		this.pos15 = null;
		
		this.pos30 = null;
		
		this.pos60 = null;
				
	}
	

	// Construtor com parametro
	public Friend(Long id_friend, String name, Long fpoints, String picture, Long score15, Long score30, Long score60,
			Long pos15, Long pos30, Long pos60) {
		this.idFriend = id_friend;
		
		this.name = name;
		
		this.fpoints = fpoints;
		
		this.picture = picture;
		
		this.score15 = score15;
		
		this.score30 = score30;
		
		this.score60 = score60;
		
		this.pos15 = pos15;
		
		this.pos30 = pos30;
		
		this.pos60 = pos60;
				
	}

	
	//metodo toString
	@Override
	public String toString() {
		return "Friend [idFriend = " + idFriend + ", name = " + name + ", fpoints = " + fpoints + ", picture = " + picture
				+ ", score15 = " + score15 + ", score30 = " + score30 + ", score60 = " + score60 + ", pos15 = " + pos15
				+ ", pos30 = " + pos30 + ", pos60 = " + pos60 + "]";
	}

	
	// getters e setters
	public Long getIdFriend() {
		return idFriend;
	}

	public void setIdFriend(Long id_friend) {
		this.idFriend = id_friend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getFpoints() {
		return fpoints;
	}

	public void setFpoints(Long fpoints) {
		this.fpoints = fpoints;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Long getScore15() {
		return score15;
	}

	public void setScore15(Long score15) {
		this.score15 = score15;
	}

	public Long getScore30() {
		return score30;
	}

	public void setScore30(Long score30) {
		this.score30 = score30;
	}

	public Long getScore60() {
		return score60;
	}

	public void setScore60(Long score60) {
		this.score60 = score60;
	}

	public Long getPos15() {
		return pos15;
	}

	public void setPos15(Long pos15) {
		this.pos15 = pos15;
	}

	public Long getPos30() {
		return pos30;
	}

	public void setPos30(Long pos30) {
		this.pos30 = pos30;
	}

	public Long getPos60() {
		return pos60;
	}

	public void setPos60(Long pos60) {
		this.pos60 = pos60;
	}

	
}
