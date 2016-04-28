package helios.siteweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import helios.siteweb.dao.ArticleDao;
import helios.siteweb.model.Article;

public class ArticleDaoImpl implements ArticleDao{

	public List<Article> getArticleAccueil() {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT id_Article, titre_Article, photoPresentation_Article FROM article ORDER BY date_Article DESC");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getInt("id_Article"), rs.getString("titre_Article"), 
						rs.getString("photoPresentation_Article")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public List<Article> getArticleAccueilTest() {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProviderTest.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT idArticle, titreArticle, photoPresentationArticle FROM article ORDER BY dateArticle DESC");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getInt("idArticle"), rs.getString("titreArticle"), 
						rs.getString("photoPresentation")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public List<Article> getArticle() {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM article ORDER BY date_Article DESC");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getInt("id_Article"), rs.getString("titre_Article"), 
						rs.getString("photoPresentation_Article"), rs.getString("textePresentation_Article"),
						rs.getString("date_Article")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public List<Article> getArticleTest() {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProviderTest.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM article ORDER BY dateArticle DESC");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getInt("idArticle"), rs.getString("titreArticle"), 
						rs.getString("photoPresentation"), rs.getString("textePresentation"),
						rs.getString("dateArticle")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public List<Article> getArticleCategorie(String categorie_Article) {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM article WHERE categorie_Article = ? ORDER BY date_Article DESC");
			stmt.setString(1, categorie_Article);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getInt("id_Article"), rs.getString("titre_Article"), 
						rs.getString("photoPresentation_Article"), rs.getString("textePresentation_Article"),
						rs.getString("date_Article")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public List<Article> getArticleCategorieTest(String categorie) {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProviderTest.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM article WHERE categorieArticle = ? ORDER BY dateArticle DESC");
			stmt.setString(1, categorie);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getInt("idArticle"), rs.getString("titreArticle"), 
						rs.getString("photoPresentation"), rs.getString("textePresentation"),
						rs.getString("dateArticle")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public List<Article> getCategorie() {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT DISTINCT categorie_Article FROM article ORDER BY categorie_Article");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getString("categorie_Article")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public List<Article> getCategorieTest() {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProviderTest.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT DISTINCT categorieArticle FROM article ORDER BY categorieArticle");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getString("categorieArticle")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public List<Article> getArticleRecherche(String texte) {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM article WHERE CONCAT(titre_Article, ' ',textePresentation_Article, ' ', texte_Article, ' ',categorie_Article) LIKE ? ORDER BY date_Article DESC");
			stmt.setString(1, "%"+texte+"%");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getInt("id_Article"), rs.getString("titre_Article"), 
						rs.getString("photoPresentation_Article"), rs.getString("textePresentation_Article"),
						rs.getString("date_Article")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public List<Article> getArticleRechercheTest(String texte) {
		List<Article> listeArticle = new ArrayList<Article>();
		
		try {
			Connection connection = DataSourceProviderTest.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM article WHERE CONCAT(titreArticle, ' ',textePresentation, ' ', texteArticle, ' ',categorieArticle) LIKE ?");
			stmt.setString(1, "%"+texte+"%");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeArticle.add(new Article(rs.getInt("idArticle"), rs.getString("titreArticle"), 
						rs.getString("photoPresentation"), rs.getString("textePresentation"),
						rs.getString("dateArticle")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
	
	public Article getArticle(Integer id) {
		Article a = new Article(null, null, null, null, null, null, null, null);
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM article WHERE id_Article = ?");
			stmt.setInt(1, id);
			ResultSet resultSet = stmt.executeQuery();
			if (resultSet.next()) {
				a = new Article(resultSet.getInt("id_Article"), resultSet.getString("titre_Article"),
						resultSet.getString("photoPresentation_Article"), resultSet.getString("textePresentation_Article"), 
						resultSet.getString("photo_Article"), resultSet.getString("texte_Article"),
						resultSet.getString("date_Article"), resultSet.getString("langue_Article"));
			}
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
}
