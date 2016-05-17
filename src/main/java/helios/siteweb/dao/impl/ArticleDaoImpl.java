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
			
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				listeArticle.add(new Article(resultSet.getInt("id_Article"), resultSet.getString("titre_Article"),
						resultSet.getString("photoPresentation_Article"), resultSet.getString("textePresentation_Article"), 
						resultSet.getString("photo_Article"), resultSet.getString("texte_Article"),
						resultSet.getString("date_Article"),resultSet.getString("categorie_Article"),
						resultSet.getString("langue_Article")));
			}
			
			resultSet.close();
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
						resultSet.getString("date_Article"),resultSet.getString("categorie_Article"), resultSet.getString("langue_Article"));
			}
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	
	public void modifierArticle(Article nouvelArticle){
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();

			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM article WHERE id_Article=?");
			stmt.setInt(1, nouvelArticle.getId_Article());
			ResultSet resultSet = stmt.executeQuery();

			resultSet.next();
			PreparedStatement stmt2 = connection
					.prepareStatement("UPDATE article SET titre_Article =?,"
							+ " photoPresentation_Article=?,textePresentation_Article=?,photo_Article=?, texte_Article=?,"
							+ "date_Article=?,categorie_Article=?, langue_Article=? "
							+ "  WHERE id_Article=?");


			stmt2.setInt(9, nouvelArticle.getId_Article());

			stmt2.setString(1, nouvelArticle.getTitre_Article());
			stmt2.setString(2, nouvelArticle.getPhotoPresentation_Article());
			stmt2.setString(3, nouvelArticle.getTextePresentation_Article());
			stmt2.setString(4, nouvelArticle.getPhoto_Article());
			stmt2.setString(5, nouvelArticle.getTexte_Article());
			stmt2.setString(6, nouvelArticle.getDate_Article());
			stmt2.setString(7, nouvelArticle.getCategorie_Article());
			stmt2.setString(8, nouvelArticle.getLangue_Article());

			stmt2.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void ajouterArticle(Article nouvelArticle){
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement(
					"INSERT INTO `article`(`titre_Article`,`photoPresentation_Article`,`textePresentation_Article`,`photo_Article`,`texte_Article`,`date_Article`,`categorie_Article`,`langue_Article`)VALUES(?,?,?,?,?,?,?,?);");
			stmt.setString(1, nouvelArticle.getTitre_Article());
			stmt.setString(2, nouvelArticle.getPhotoPresentation_Article());
			stmt.setString(3, nouvelArticle.getTextePresentation_Article());
			stmt.setString(4, nouvelArticle.getPhoto_Article());
			stmt.setString(5, nouvelArticle.getTexte_Article());
			stmt.setString(6, nouvelArticle.getDate_Article());
			stmt.setString(7, nouvelArticle.getCategorie_Article());
			stmt.setString(8, nouvelArticle.getLangue_Article());

			stmt.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void supprimerArticle(Integer id_Article){
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();

			PreparedStatement stmt = connection.prepareStatement("DELETE FROM article WHERE id_article=?");
			stmt.setInt(1, id_Article);
			stmt.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
