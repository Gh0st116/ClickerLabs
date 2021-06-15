package entities;

import java.time.LocalDateTime;

public class AddFriend {

	// classe para relacionamento N:N entre User e Friend
	
	private Long idAddFriend;
	private LocalDateTime addDate;
	
	// relacionamento 1:N com User
	private User user;
	
	// relacionamento 1:N com Friend
	private Friend friend;

	

	// construtor vazio
	public AddFriend() {
		this.idAddFriend = null;
		this.addDate = LocalDateTime.now();
		this.user = new User();
		this.friend = new Friend();
	}

	
	// construtor com parametros
	public AddFriend(Long idAddFriend, LocalDateTime addDate, User user, Friend friend) {
		this.idAddFriend = idAddFriend;
		this.addDate = addDate;
		this.user = user;
		this.friend = friend;
	}

	//metodo toString
	@Override
	public String toString() {
		return "AddFriend [idAddFriend = " + idAddFriend + ", addDate = " + addDate + ", user = " + user + ", friend = "
				+ friend + "]";
	}

	
	// getters e setters
	public Long getIdAddFriend() {
		return idAddFriend;
	}

	public void setIdAddFriend(Long idAddFriend) {
		this.idAddFriend = idAddFriend;
	}

	public LocalDateTime getAddDate() {
		return addDate;
	}

	public void setAddDate(LocalDateTime addDate) {
		this.addDate = addDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	
}
