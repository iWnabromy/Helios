package helios.siteweb.model;

public class Galerie {
	
	private Integer id_Galerie;
	private String article_Galerie;
	private String titre_Galerie;
	private String description_Galerie;
	private String date_Galerie;
	private String lien_Galerie;
	private String categorie_Galerie;
	private String type_Galerie;
	private String langue_Galerie;
	
	public Galerie(Integer id_Galerie,
			String article_Galerie,
			String titre_Galerie,
			String description_Galerie,
			String date_Galerie,
			String lien_Galerie,
			String categorie_Galerie,
			String type_Galerie,
			String langue_Galerie){
		this.id_Galerie = id_Galerie;
		this.article_Galerie = article_Galerie;
		this.titre_Galerie = titre_Galerie;
		this.description_Galerie = description_Galerie;
		this.date_Galerie = date_Galerie;
		this.lien_Galerie = lien_Galerie;
		this.categorie_Galerie = categorie_Galerie;
		this.type_Galerie = type_Galerie;
		this.langue_Galerie = langue_Galerie;
	}
	
	public Galerie(Integer id_Galerie,
			String article_Galerie,
			String titre_Galerie,
			String description_Galerie,
			String lien_Galerie){
		this.id_Galerie = id_Galerie;
		this.article_Galerie = article_Galerie;
		this.titre_Galerie = titre_Galerie;
		this.description_Galerie = description_Galerie;
		this.lien_Galerie = lien_Galerie;
	}

	public Integer getId_Galerie() {
		return id_Galerie;
	}

	public void setId_Galerie(Integer id_Galerie) {
		this.id_Galerie = id_Galerie;
	}

	public String getArticle_Galerie() {
		return article_Galerie;
	}

	public void setArticle_Galerie(String article_Galerie) {
		this.article_Galerie = article_Galerie;
	}

	public String getTitre_Galerie() {
		return titre_Galerie;
	}

	public void setTitre_Galerie(String titre_Galerie) {
		this.titre_Galerie = titre_Galerie;
	}

	public String getDescription_Galerie() {
		return description_Galerie;
	}

	public void setDescription_Galerie(String description_Galerie) {
		this.description_Galerie = description_Galerie;
	}

	public String getDate_Galerie() {
		return date_Galerie;
	}

	public void setDate_Galerie(String date_Galerie) {
		this.date_Galerie = date_Galerie;
	}

	public String getLien_Galerie() {
		return lien_Galerie;
	}

	public void setLien_Galerie(String lien_Galerie) {
		this.lien_Galerie = lien_Galerie;
	}

	public String getCategorie_Galerie() {
		return categorie_Galerie;
	}

	public void setCategorie_Galerie(String categorie_Galerie) {
		this.categorie_Galerie = categorie_Galerie;
	}

	public String getType_Galerie() {
		return type_Galerie;
	}

	public void setType_Galerie(String type_Galerie) {
		this.type_Galerie = type_Galerie;
	}

	public String getLangue_Galerie() {
		return langue_Galerie;
	}

	public void setLangue_Galerie(String langue_Galerie) {
		this.langue_Galerie = langue_Galerie;
	}
	
}
