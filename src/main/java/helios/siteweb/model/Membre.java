package helios.siteweb.model;

public class Membre {
	
	private Integer id_Membre;
	private String nom_Membre;
	private String prenom_Membre;
	private String job_Membre;
	private String photo_Membre;
	private String description_Membre;
	private String facebook_Membre;
	private String link_Membre;
	private String twitter_Membre;
	private String insta_Membre;
	private String mail_Membre;
	private String langue_Membre;
	
	public Membre(Integer id_Membre, String nom_Membre, 
			String prenom_Membre, 
			String job_Membre,
			String photo_Membre, 
			String description_Membre, 
			String facebook_Membre, 
			String link_Membre,
			String twitter_Membre, 
			String insta_Membre,
			String mail_Membre, 
			String langue_Membre){
		this.id_Membre = id_Membre;
		this.nom_Membre = nom_Membre;
		this.prenom_Membre = prenom_Membre;
		this.job_Membre = job_Membre;
		this.photo_Membre = photo_Membre;
		this.description_Membre = description_Membre;
		this.facebook_Membre = facebook_Membre;
		this.link_Membre = link_Membre;
		this.twitter_Membre = twitter_Membre;
		this.insta_Membre = insta_Membre;
		this.mail_Membre = mail_Membre;
		this.langue_Membre = langue_Membre;
	}

	public Integer getId_Membre() {
		return id_Membre;
	}

	public void setId_Membre(Integer id_Membre) {
		this.id_Membre = id_Membre;
	}

	public String getNom_Membre() {
		return nom_Membre;
	}

	public void setNom_Membre(String nom_Membre) {
		this.nom_Membre = nom_Membre;
	}

	public String getPrenom_Membre() {
		return prenom_Membre;
	}

	public void setPrenom_Membre(String prenom_Membre) {
		this.prenom_Membre = prenom_Membre;
	}

	public String getJob_Membre() {
		return job_Membre;
	}

	public void setJob_Membre(String job_Membre) {
		this.job_Membre = job_Membre;
	}

	public String getPhoto_Membre() {
		return photo_Membre;
	}

	public void setPhoto_Membre(String photo_Membre) {
		this.photo_Membre = photo_Membre;
	}

	public String getdescription_Membre() {
		return description_Membre;
	}

	public void setdescription_Membre(String description_Membre) {
		this.description_Membre = description_Membre;
	}

	public String getFacebook_Membre() {
		return facebook_Membre;
	}

	public void setFacebook_Membre(String facebook_Membre) {
		this.facebook_Membre = facebook_Membre;
	}

	public String getLink_Membre() {
		return link_Membre;
	}

	public void setLink_Membre(String link_Membre) {
		this.link_Membre = link_Membre;
	}

	public String getTwitter_Membre() {
		return twitter_Membre;
	}

	public void setTwitter_Membre(String twitter_Membre) {
		this.twitter_Membre = twitter_Membre;
	}

	public String getInsta_Membre() {
		return insta_Membre;
	}

	public void setInsta_Membre(String insta_Membre) {
		this.insta_Membre = insta_Membre;
	}

	public String getMail_Membre() {
		return mail_Membre;
	}

	public void setMail_Membre(String mail_Membre) {
		this.mail_Membre = mail_Membre;
	}

	public String getLangue_Membre() {
		return langue_Membre;
	}

	public void setLangue_Membre(String langue_Membre) {
		this.langue_Membre = langue_Membre;
	}
	
}
