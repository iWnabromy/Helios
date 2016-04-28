package helios.siteweb.dao.impl;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import helios.siteweb.dao.ArticleDao;
import helios.siteweb.model.Article;

public class ArticleDaoTestCase {
	
	//private ArticleDao articleDao = new ArticleDaoImpl();
	
	@Before
	public void initDb() throws Exception{
		Connection connection = DataSourceProviderTest.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM article");
		stmt.executeUpdate("INSERT INTO `article`(`titreArticle`,`photoPresentation`,"
				+ "`textePresentation`,`texteArticle`,`photoArticle`,"
				+ "`dateArticle`,`categorieArticle`,"
				+ "`langueArticle`) VALUES ('Toto','article1.jpg',"
				+ "'Coucou, je suis un test', 'Et moi, je suis un texte',"
				+ "'article1.jpg','12-12-12','Test1','francais')");
		stmt.executeUpdate("INSERT INTO `article`(`titreArticle`,`photoPresentation`,"
				+ "`textePresentation`,`texteArticle`,`photoArticle`,"
				+ "`dateArticle`,`categorieArticle`,"
				+ "`langueArticle`) VALUES ('Sisi','article2.jpg',"
				+ "'Tiens un revenant', 'Et bah non, je suis pas la.',"
				+ "'article2.jpg','01-01-01','Test2','anglais')");
		stmt.close();
		connection.close();
	}
	/*
	@Test
	public void testerGetArticleAccueil(){
		List<Article> article = articleDao.getArticleAccueilTest();
		Assert.assertEquals(2, article.size());
		Assert.assertEquals("Sisi", article.get(1).getTitreArticle());
		Assert.assertEquals("article1.jpg", article.get(0).getPhotoPresentation());
	}
	
	@Test
	public void testerGetArticle(){
		List<Article> article = articleDao.getArticleTest();
		Assert.assertEquals(2, article.size());
		Assert.assertEquals("Tiens un revenant", article.get(1).getTextePresentation());
		Assert.assertEquals("12-12-12", article.get(0).getDateArticle());
	}
	
	@Test
	public void testerGetArticleCategorie(){
		List<Article> article = articleDao.getArticleCategorieTest("Test1");
		Assert.assertEquals(1, article.size());
		Assert.assertEquals("Toto", article.get(0).getTitreArticle());
	}
	
	@Test
	public void testerGetCategorie(){
		List<Article> article = articleDao.getCategorieTest();
		Assert.assertEquals(2, article.size());
		Assert.assertEquals("Test1", article.get(0).getCategorieArticle());
		Assert.assertEquals("Test2", article.get(1).getCategorieArticle());
	}
	
	@Test
	public void testerGetArticleRecherche(){
		List<Article> article = articleDao.getArticleRechercheTest("revenant");
		Assert.assertEquals(1, article.size());
		Assert.assertEquals("Sisi", article.get(0).getTitreArticle());
	}
	*/
}
