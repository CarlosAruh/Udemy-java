package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class User {
	
	private String users;
	private Date moment;
	
	public static SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	
	public User() {
		
	}

	public User(String users, Date time) {
		super();
		this.users = users;
		this.moment = time;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public Date getTime() {
		return moment;
	}

	public void setTime(Date time) {
		this.moment = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(users);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(users, other.users);
	}
	
	
}
