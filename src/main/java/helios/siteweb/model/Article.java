package helios.siteweb.model;

public class Article {
	
	private Integer id_Article;
	private String titre_Article;
	private String photoPresentation_Article;
	private String textePresentation_Article;
	private String photo_Article;
	private String texte_Article;
	private String date_Article;
	private String categorie_Article;
	private String langue_Article;
	
	public Article(Integer id_Article, 
			String titre_Article, 
			String photoPresentation_Article,
			String textePresentation_Article, 
			String photo_Article,
			String texte_Article,
			String date_Article, 
			String categorie_Article, 
			String langue_Article){
		this.id_Article = id_Article;
		this.titre_Article = titre_Article;
		this.photoPresentation_Article = photoPresentation_Article;
	this.textePresentation_Article = textePresentation_Article;
		this.texte_Article = texte_Article;
		this.photo_Article = photo_Article;
		this.date_Article = date_Article;
		this.categorie_Article = categorie_Article;
		this.langue_Article = langue_Article;
	}
	
	public Article(Integer id_Article, 
			String titre_Article, 
			String photoPresentation_Article,
			String textePresentation_Article, 
			String photo_Article, 
			String texte_Article,
			String date_Article, 
			String langue_Article){
		this.id_Article = id_Article;
		this.titre_Article = titre_Article;
		this.photoPresentation_Article = photoPresentation_Article;
		this.textePresentation_Article = textePresentation_Article;
		this.texte_Article = texte_Article;
		this.photo_Article = photo_Article;
		this.date_Article = date_Article;
		this.langue_Article = langue_Article;
	}
	
	public Article(Integer id_Article, 
			String titre_Article, 
			String photoPresentation_Article){
		this.id_Article = id_Article;
		this.titre_Article = titre_Article;
		this.photoPresentation_Article = photoPresentation_Article;
	}
	
	public Article(Integer id_Article, 
			String titre_Article, 
			String photoPresentation_Article,
			String textePresentation_Article, 
			String date_Article){
		this.id_Article = id_Article;
		this.titre_Article = titre_Article;
		this.photoPresentation_Article = photoPresentation_Article;
		this.textePresentation_Article = textePresentation_Article;
		this.date_Article = date_Article;
	}
	
	public Article(String categorie_Article){
		this.categorie_Article = categorie_Article;
	}

	public Integer getId_Article() {
		return id_Article;
	}

	public void setId_Article(Integer id_Article) {
		this.id_Article = id_Article;
	}

	public String getTitre_Article() {
		return titre_Article;
	}

	public void setTitre_Article(String titre_Article) {
		this.titre_Article = titre_Article;
	}

	public String getPhotoPresentation_Article() {
		return photoPresentation_Article;
	}

	public void setPhotoPresentation_Article(String photoPresentation_Article) {
		this.photoPresentation_Article = photoPresentation_Article;
	}

	public String getTextePresentation_Article() {
		return textePresentation_Article;
	}

	public void setTextePresentation_Article(String textePresentation_Article) {
		this.textePresentation_Article = textePresentation_Article;
	}

	public String getPhoto_Article() {
		return photo_Article;
	}

	public void setPhoto_Article(String photo_Article) {
		this.photo_Article = photo_Article;
	}

	public String getTexte_Article() {
		return texte_Article;
	}

	public void setTexte_Article(String texte_Article) {
		this.texte_Article = texte_Article;
	}

	public String getDate_Article() {
		return date_Article;
	}

	public void setDate_Article(String date_Article) {
		this.date_Article = date_Article;
	}

	public String getCategorie_Article() {
		return categorie_Article;
	}

	public void setCategorie_Article(String categorie_Article) {
		this.categorie_Article = categorie_Article;
	}

	public String getLangue_Article() {
		return langue_Article;
	}

	public void setLangue_Article(String langue_Article) {
		this.langue_Article = langue_Article;
	}
	
}
