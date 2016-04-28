package helios.siteweb.model;

public class Categorie {
	
	private Integer id_Categorie;
	private String nom_Categorie;
	
	public Categorie(Integer id_Categorie,
			String nom_Categorie){
		this.id_Categorie = id_Categorie;
		this.nom_Categorie = nom_Categorie;
	}

	public Integer getId_Categorie() {
		return id_Categorie;
	}

	public void setId_Categorie(Integer id_Categorie) {
		this.id_Categorie = id_Categorie;
	}

	public String getNom_Categorie() {
		return nom_Categorie;
	}

	public void setNom_Categorie(String nom_Categorie) {
		this.nom_Categorie = nom_Categorie;
	}
	
}
