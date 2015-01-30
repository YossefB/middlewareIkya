package ikya.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUser;

	private String login;

	private String mail;

	private String password;

	//bi-directional many-to-one association to Contact
	@OneToMany(mappedBy="toUser")
	private List<Contact> toUser;

	//bi-directional many-to-one association to Contact
	@OneToMany(mappedBy="fromUser")
	private List<Contact> fromUser;

	//bi-directional many-to-one association to Defi
	@OneToMany(mappedBy="chefDefi")
	private List<Defi> chefDefi;

	//bi-directional many-to-one association to Defi
	@OneToMany(mappedBy="userChallenged")
	private List<Defi> userChallenged;

	public User() {
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Contact> getToUser() {
		return this.toUser;
	}

	public void setToUser(List<Contact> toUser) {
		this.toUser = toUser;
	}

	public Contact addToUser(Contact toUser) {
		getToUser().add(toUser);
		toUser.setToUser(this);

		return toUser;
	}

	public Contact removeToUser(Contact toUser) {
		getToUser().remove(toUser);
		toUser.setToUser(null);

		return toUser;
	}

	public List<Contact> getFromUser() {
		return this.fromUser;
	}

	public void setFromUser(List<Contact> fromUser) {
		this.fromUser = fromUser;
	}

	public Contact addFromUser(Contact fromUser) {
		getFromUser().add(fromUser);
		fromUser.setFromUser(this);

		return fromUser;
	}

	public Contact removeFromUser(Contact fromUser) {
		getFromUser().remove(fromUser);
		fromUser.setFromUser(null);

		return fromUser;
	}

	public List<Defi> getChefDefi() {
		return this.chefDefi;
	}

	public void setChefDefi(List<Defi> chefDefi) {
		this.chefDefi = chefDefi;
	}

	public Defi addChefDefi(Defi chefDefi) {
		getChefDefi().add(chefDefi);
		chefDefi.setChefDefi(this);

		return chefDefi;
	}

	public Defi removeChefDefi(Defi chefDefi) {
		getChefDefi().remove(chefDefi);
		chefDefi.setChefDefi(null);

		return chefDefi;
	}

	public List<Defi> getUserChallenged() {
		return this.userChallenged;
	}

	public void setUserChallenged(List<Defi> userChallenged) {
		this.userChallenged = userChallenged;
	}

	public Defi addDefis2(Defi userChallenged) {
		getUserChallenged().add(userChallenged);
		userChallenged.setUserChallenged(this);

		return userChallenged;
	}

	public Defi removeDefis2(Defi userChallenged) {
		getUserChallenged().remove(userChallenged);
		userChallenged.setUserChallenged(null);

		return userChallenged;
	}

}