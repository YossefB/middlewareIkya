package ikya.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the contact database table.
 * 
 */
@Entity
@NamedQuery(name="Contact.findAll", query="SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idContact;

	private int statut;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="toUser")
	private User toUser;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="fromUser")
	private User fromUser;

	public Contact() {
	}

	public int getIdContact() {
		return this.idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	public int getStatut() {
		return this.statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}

	public User getToUser() {
		return this.toUser;
	}

	public void setToUser(User toUser) {
		this.toUser = toUser;
	}

	public User getFromUser() {
		return this.fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

}