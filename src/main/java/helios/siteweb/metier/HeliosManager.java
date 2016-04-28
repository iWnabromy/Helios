package helios.siteweb.metier;

import java.util.List;

import helios.siteweb.dao.AdminDao;
import helios.siteweb.dao.ArticleDao;
import helios.siteweb.dao.EvenementDao;
import helios.siteweb.dao.GalerieDao;
import helios.siteweb.dao.MembreDao;
import helios.siteweb.dao.PartenaireDao;
import helios.siteweb.dao.impl.AdminDaoImpl;
import helios.siteweb.dao.impl.ArticleDaoImpl;
import helios.siteweb.dao.impl.EvenementDaoImpl;
import helios.siteweb.dao.impl.GalerieDaoImpl;
import helios.siteweb.dao.impl.MembreDaoImpl;
import helios.siteweb.dao.impl.PartenaireDaoImpl;
import helios.siteweb.model.Admin;
import helios.siteweb.model.Article;
import helios.siteweb.model.Evenement;
import helios.siteweb.model.Membre;
import helios.siteweb.model.Partenaire;
import helios.siteweb.model.Galerie;

public class HeliosManager {
	
	public static HeliosManager instance;
	
	public static HeliosManager getInstance(){
		if(instance == null){
			instance = new HeliosManager();
		}
		return instance;
	}
	
	private ArticleDao articleDao = new ArticleDaoImpl();
	private EvenementDao evenementDao = new EvenementDaoImpl();
	private MembreDao membreDao = new MembreDaoImpl();
	private PartenaireDao partenaireDao = new PartenaireDaoImpl();
	private GalerieDao galerieDao = new GalerieDaoImpl();
	private AdminDao adminDao = new AdminDaoImpl();
	
	private HeliosManager(){
		
	}
	
	public List<Article> getArticleAccueil(){
		List<Article> listeArticle = articleDao.getArticleAccueil();
		return listeArticle;
	}
	
	public List<Article> getArticle(){
		List<Article> listeArticle = articleDao.getArticle();
		return listeArticle;
	}
	
	public List<Evenement> getEvenement(){
		List<Evenement> listeEvenement = evenementDao.getEvenement();
		return listeEvenement;
	}
	
	public List<Membre> getMembre(){
		List<Membre> listeMembre = membreDao.getMembre();
		return listeMembre;
	}
	
	public List<Partenaire> getPartenaire(){
		List<Partenaire> listePartenaire = partenaireDao.getPartenaire();
		return listePartenaire;
	}
	
	public List<Galerie> getPhoto(){
		List<Galerie> listePhoto = galerieDao.getPhoto();
		return listePhoto;
	}
	
	public List<Galerie> getVideo(){
		List<Galerie> listePhoto = galerieDao.getVideo();
		return listePhoto;
	}
	
	public List<Article> getArticleCategorie(String categorie){
		List<Article> listeArticle = articleDao.getArticleCategorie(categorie);
		return listeArticle;
	}
	
	public List<Article> getCategorie(){
		List<Article> listeArticle = articleDao.getCategorie();
		return listeArticle;
	}
	
	public List<Article> getArticleRecherche(String texte){
		List<Article> listeArticle = articleDao.getArticleRecherche(texte);
		return listeArticle;
	}
	
	public Article getArticle(Integer id) {
		Article article = articleDao.getArticle(id);
		return article;		
	}
	
	public Membre getMembre(Integer id) {
		Membre membre = membreDao.getMembre(id);
		return membre;
	}

	public void ModifierMembre(Membre nouveauMembre) {
		if (nouveauMembre == null) {
			throw new IllegalArgumentException("Le membre à modifier ne peut pas être null.");
		}
		else
			membreDao.ModifierMembre(nouveauMembre);

	}

	public void ajouterMembre(Membre nouveauMembre) {
		membreDao.ajouterMembre(nouveauMembre);
	}


	public void supprimerMembre(Integer id_Membre) {
		membreDao.supprimerMembre(id_Membre);		
	}

	public List<helios.siteweb.model.Admin> getAdmin() {
		List<Admin> listeAdmin = adminDao.getAdmin();
		return listeAdmin;
	}
}
