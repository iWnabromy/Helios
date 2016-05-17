package helios.siteweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import helios.siteweb.dao.CategorieDao;
import helios.siteweb.model.Categorie;

public class CategorieDaoImpl implements CategorieDao {
	
	public List<Categorie> getCategorie(){
		List<Categorie> listeCategorie= new ArrayList<Categorie>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM categorie");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeCategorie.add(new Categorie(rs.getInt("id_Categorie"),rs.getString("nom_Categorie")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeCategorie;
	}
	
	public Categorie getCategorie(Integer id) {
		Categorie c = new Categorie(id, null);
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM categorie WHERE id_Categorie = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				c = new Categorie(rs.getInt("id_Categorie"),rs.getString("nom_Categorie"));
			}
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	public void ModifierCategorie(Categorie nouvelleCategorie) {
		// Creer une nouvelle connexion a la BDD

		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();

			// Utiliser la connexion

			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM categorie WHERE id_Categorie=?");
			stmt.setInt(1, nouvelleCategorie.getId_Categorie());
			ResultSet resultSet = stmt.executeQuery();

			resultSet.next();
			PreparedStatement stmt2 = connection
					.prepareStatement("UPDATE categorie SET nom_Categorie =?"
							+ "  WHERE id_Categorie=?");


			stmt2.setInt(12, nouvelleCategorie.getId_Categorie());

			stmt2.setString(1, nouvelleCategorie.getNom_Categorie());

			stmt2.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}	
	public void ajouterCategorie(Categorie categorie) {

		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement(
					"INSERT INTO `categorie`(`nom_Categorie`)VALUES(?);");
			stmt.setString(1, categorie.getNom_Categorie());

			stmt.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void supprimerCategorie(Integer id) {
		// Creer une nouvelle connexion a la BDD

		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();

			// Utiliser la connexion

			PreparedStatement stmt = connection.prepareStatement("DELETE FROM categorie WHERE id_Categorie=?");
			stmt.setInt(1, id);
			stmt.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
