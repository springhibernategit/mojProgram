package easy.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Administrator {
	@Id
	@GeneratedValue
	private long id;
	private String nameOfAdministrator;
	private String login;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNameOfAdministrator() {
		return nameOfAdministrator;
	}

	public void setNameOfAdministrator(String nameOfAdministrator) {
		this.nameOfAdministrator = nameOfAdministrator;
	}
	
	

}
