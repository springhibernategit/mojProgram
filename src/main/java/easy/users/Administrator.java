package easy.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Administrator {
	@Id
	@GeneratedValue
	private String login;
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	} 
	
	


}
