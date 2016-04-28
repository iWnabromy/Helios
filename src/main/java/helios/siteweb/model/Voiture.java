package helios.siteweb.model;

public class Voiture {
	
	private Integer id_Voiture;
	private String nom_Voiture;
	private String photo_Voiture;
	private String description_Voiture;
	private String langue_Voiture;
	
	public Voiture(Integer id_Voiture,
			String nom_Voiture, 
			String photo_Voiture,
			String description_Voiture,
			String langue_Voiture){
		this.id_Voiture = id_Voiture;
		this.nom_Voiture = nom_Voiture;
		this.photo_Voiture = photo_Voiture;
		this.description_Voiture = description_Voiture;
		this.langue_Voiture = langue_Voiture;
	}

	public Integer getId_Voiture() {
		return id_Voiture;
	}

	public void setId_Voiture(Integer id_Voiture) {
		this.id_Voiture = id_Voiture;
	}

	public String getNom_Voiture() {
		return nom_Voiture;
	}

	public void setNom_Voiture(String nom_Voiture) {
		this.nom_Voiture = nom_Voiture;
	}

	public String getPhoto_Voiture() {
		return photo_Voiture;
	}

	public void setPhoto_Voiture(String photo_Voiture) {
		this.photo_Voiture = photo_Voiture;
	}

	public String getDescription_Voiture() {
		return description_Voiture;
	}

	public void setDescription_Voiture(String description_Voiture) {
		this.description_Voiture = description_Voiture;
	}

	public String getLangue_Voiture() {
		return langue_Voiture;
	}

	public void setLangue_Voiture(String langue_Voiture) {
		this.langue_Voiture = langue_Voiture;
	}
	
}
