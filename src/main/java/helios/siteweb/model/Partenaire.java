package helios.siteweb.model;

public class Partenaire {
	
	private Integer id_Partenaire;
	private String nom_Partenaire;
	private String description_Partenaire;
	private String photo_Partenaire;
	private String lien_Partenaire;
	private Integer importance_Partenaire;
	private String langue_Partenaire;
	
	public Partenaire(
			Integer id_Partenaire,
			String nom_Partenaire, 
			String description_Partenaire,
			String photo_Partenaire, 
			String lien_Partenaire,
			Integer importance_Partenaire,
			String langue_Partenaire){
		this.id_Partenaire = id_Partenaire;
		this.nom_Partenaire = nom_Partenaire;
		this.description_Partenaire = description_Partenaire;
		this.photo_Partenaire = photo_Partenaire;
		this.lien_Partenaire= lien_Partenaire;
		this.importance_Partenaire = importance_Partenaire;
		this.langue_Partenaire = langue_Partenaire;
	}
	
	public Partenaire(String nom_Partenaire, 
			String description_Partenaire,
			String photo_Partenaire, 
			String lien_Partenaire){
		this.nom_Partenaire = nom_Partenaire;
		this.description_Partenaire = description_Partenaire;
		this.photo_Partenaire = photo_Partenaire;
		this.lien_Partenaire = lien_Partenaire;
	}

	public Integer getId_Partenaire() {
		return id_Partenaire;
	}

	public void setId_Partenaire(Integer id_Partenaire) {
		this.id_Partenaire = id_Partenaire;
	}

	public String getNom_Partenaire() {
		return nom_Partenaire;
	}

	public void setNom_Partenaire(String nom_Partenaire) {
		this.nom_Partenaire = nom_Partenaire;
	}

	public String getDescription_Partenaire() {
		return description_Partenaire;
	}

	public void setDescription_Partenaire(String description_Partenaire) {
		this.description_Partenaire = description_Partenaire;
	}

	public String getPhoto_Partenaire() {
		return photo_Partenaire;
	}

	public void setPhoto_Partenaire(String photo_Partenaire) {
		this.photo_Partenaire = photo_Partenaire;
	}

	public String getLien_Partenaire() {
		return lien_Partenaire;
	}

	public void setLien_Partenaire(String lien_Partenaire) {
		this.lien_Partenaire = lien_Partenaire;
	}

	public Integer getImportance_Partenaire() {
		return importance_Partenaire;
	}

	public void setImportance_Partenaire(Integer importance_Partenaire) {
		this.importance_Partenaire = importance_Partenaire;
	}

	public String getLangue_Partenaire() {
		return langue_Partenaire;
	}

	public void setLangue_Partenaire(String langue_Partenaire) {
		this.langue_Partenaire = langue_Partenaire;
	}
	
}
