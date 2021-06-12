package entities;



public class Friend {

	private long idFriend;
	private String name;
	private long fpoints;
	private String picture;
	private long score15;
	private long score30;
	private long score60;
	private long pos15;
	private long pos30;
	private long pos60;

	
	// Construtor vazio
	public Friend() {
		this.idFriend = 0;
		
		this.name = "";
		
		this.fpoints = 0;
		
		this.picture = "";
		
		this.score15 = 0;
		
		this.score30 = 0;
		
		this.score60 = 0;
		
		this.pos15 = 0;
		
		this.pos30 = 0;
		
		this.pos60 = 0;
				
	}
	

	// Construtor com parametro
	public Friend(long id_friend, String name, long fpoints, String picture, long score15, long score30, long score60,
			long pos15, long pos30, long pos60) {
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
	public long getIdFriend() {
		return idFriend;
	}

	public void setIdFriend(long id_friend) {
		this.idFriend = id_friend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getFpoints() {
		return fpoints;
	}

	public void setFpoints(long fpoints) {
		this.fpoints = fpoints;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public long getScore15() {
		return score15;
	}

	public void setScore15(long score15) {
		this.score15 = score15;
	}

	public long getScore30() {
		return score30;
	}

	public void setScore30(long score30) {
		this.score30 = score30;
	}

	public long getScore60() {
		return score60;
	}

	public void setScore60(long score60) {
		this.score60 = score60;
	}

	public long getPos15() {
		return pos15;
	}

	public void setPos15(long pos15) {
		this.pos15 = pos15;
	}

	public long getPos30() {
		return pos30;
	}

	public void setPos30(long pos30) {
		this.pos30 = pos30;
	}

	public long getPos60() {
		return pos60;
	}

	public void setPos60(long pos60) {
		this.pos60 = pos60;
	}

	
}
