package helios.siteweb.model;

public class Evenement {
	
	private Integer id_Evenement;
	private String article_Evenement;
	private String nom_Evenement;
	private String description_Evenement;
	private String date_Evenement;
	private String photo_Evenement;
	private String langue_Evenement;
	
	public Evenement(Integer id_Evenement,
			String article_Evenement, 
			String nom_Evenement,
			String description_Evenement, 
			String date_Evenement,
			String photo_Evenement,
			String langue_Evenement){
		this.id_Evenement = id_Evenement;
		this.article_Evenement = article_Evenement;
		this.nom_Evenement = nom_Evenement;
		this.description_Evenement = description_Evenement;
		this.date_Evenement = date_Evenement;
		this.photo_Evenement = photo_Evenement;
		this.langue_Evenement = langue_Evenement;
	}

	public Integer getId_Evenement() {
		return id_Evenement;
	}

	public void setId_Evenement(Integer id_Evenement) {
		this.id_Evenement = id_Evenement;
	}

	public String getArticle_Evenement() {
		return article_Evenement;
	}

	public void setArticle_Evenement(String article_Evenement) {
		this.article_Evenement = article_Evenement;
	}

	public String getNom_Evenement() {
		return nom_Evenement;
	}

	public void setNom_Evenement(String nom_Evenement) {
		this.nom_Evenement = nom_Evenement;
	}

	public String getDescription_Evenement() {
		return description_Evenement;
	}

	public void setDescription_Evenement(String description_Evenement) {
		this.description_Evenement = description_Evenement;
	}

	public String getDate_Evenement() {
		return date_Evenement;
	}

	public void setDate_Evenement(String date_Evenement) {
		this.date_Evenement = date_Evenement;
	}

	public String getPhoto_Evenement() {
		return photo_Evenement;
	}

	public void setPhoto_Evenement(String photo_Evenement) {
		this.photo_Evenement = photo_Evenement;
	}

	public String getLangue_Evenement() {
		return langue_Evenement;
	}

	public void setLangue_Evenement(String langue_Evenement) {
		this.langue_Evenement = langue_Evenement;
	}
	
}
