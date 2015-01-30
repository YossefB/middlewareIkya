package ikya.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the defi database table.
 * 
 */
@Entity
@NamedQuery(name="Defi.findAll", query="SELECT d FROM Defi d")
public class Defi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDefi;

	private String description;

	private int nbParticipants;

	private String nomDefi;

	private int numDefi;

	private String resultats;

	private int typeDemande;

	private int validResultats;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="chefDefi")
	private User chefDefi;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="userChallenged")
	private User userChallenged;

	public Defi() {
	}

	public int getIdDefi() {
		return this.idDefi;
	}

	public void setIdDefi(int idDefi) {
		this.idDefi = idDefi;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNbParticipants() {
		return this.nbParticipants;
	}

	public void setNbParticipants(int nbParticipants) {
		this.nbParticipants = nbParticipants;
	}

	public String getNomDefi() {
		return this.nomDefi;
	}

	public void setNomDefi(String nomDefi) {
		this.nomDefi = nomDefi;
	}

	public int getNumDefi() {
		return this.numDefi;
	}

	public void setNumDefi(int numDefi) {
		this.numDefi = numDefi;
	}

	public String getResultats() {
		return this.resultats;
	}

	public void setResultats(String resultats) {
		this.resultats = resultats;
	}

	public int getTypeDemande() {
		return this.typeDemande;
	}

	public void setTypeDemande(int typeDemande) {
		this.typeDemande = typeDemande;
	}

	public int getValidResultats() {
		return this.validResultats;
	}

	public void setValidResultats(int validResultats) {
		this.validResultats = validResultats;
	}

	public User getChefDefi() {
		return this.chefDefi;
	}

	public void setChefDefi(User chefDefi) {
		this.chefDefi = chefDefi;
	}

	public User getUserChallenged() {
		return this.userChallenged;
	}

	public void setUserChallenged(User userChallenged) {
		this.userChallenged = userChallenged;
	}

}