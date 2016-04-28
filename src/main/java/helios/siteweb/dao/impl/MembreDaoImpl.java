package helios.siteweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import helios.siteweb.dao.MembreDao;
import helios.siteweb.model.Membre;

public class MembreDaoImpl implements MembreDao {
	
	public List<Membre> getMembre(){
		List<Membre> listeMembre= new ArrayList<Membre>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM membre");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeMembre.add(new Membre(rs.getInt("id_Membre"),rs.getString("nom_Membre"), rs.getString("prenom_Membre"),
						rs.getString("job_Membre"),rs.getString("photo_Membre"), rs.getString("description_Membre"), 
						rs.getString("facebook_Membre"), rs.getString("link_Membre"),
						rs.getString("twitter_Membre"), rs.getString("insta_Membre"), 
						rs.getString("mail_Membre"),rs.getString("langue_Membre")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeMembre;
	}
	
	public Membre getMembre(Integer id) {
		Membre m = new Membre(id, null, null, null, null, null, null, null, null, null, null, null);
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM membre WHERE id_Membre = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				m = new Membre(rs.getInt("id_Membre"),rs.getString("nom_Membre"), rs.getString("prenom_Membre"),
						rs.getString("job_Membre"),rs.getString("photo_Membre"), rs.getString("description_Membre"), 
						rs.getString("facebook_Membre"), rs.getString("link_Membre"),
						rs.getString("twitter_Membre"), rs.getString("insta_Membre"), 
						rs.getString("mail_Membre"),rs.getString("langue_Membre"));
			}
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}

	public void ModifierMembre(Membre nouveauMembre) {
		// Creer une nouvelle connexion a la BDD

		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();

			// Utiliser la connexion

			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM membre WHERE id_Membre=?");
			stmt.setInt(1, nouveauMembre.getId_Membre());
			ResultSet resultSet = stmt.executeQuery();

			resultSet.next();
			PreparedStatement stmt2 = connection
					.prepareStatement("UPDATE membre SET nom_Membre =?,"
							+ " prenom_Membre=?,job_Membre=?,photo_Membre=?, description_Membre=?,"
							+ "facebook_Membre=?,link_Membre=?,twitter_Membre=?, insta_Membre=?,mail_Membre=?, langue_Membre=? "
							+ "  WHERE id_Membre=?");


			stmt2.setInt(12, nouveauMembre.getId_Membre());

			stmt2.setString(1, nouveauMembre.getNom_Membre());
			stmt2.setString(2, nouveauMembre.getPrenom_Membre());
			stmt2.setString(3, nouveauMembre.getJob_Membre());
			stmt2.setString(4, nouveauMembre.getPhoto_Membre());
			stmt2.setString(5, nouveauMembre.getdescription_Membre());
			stmt2.setString(6, nouveauMembre.getFacebook_Membre());
			stmt2.setString(7, nouveauMembre.getLink_Membre());
			stmt2.setString(8, nouveauMembre.getTwitter_Membre());
			stmt2.setString(9, nouveauMembre.getInsta_Membre());
			stmt2.setString(10, nouveauMembre.getMail_Membre());
			stmt2.setString(11, nouveauMembre.getLangue_Membre());

			stmt2.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}	
	public void ajouterMembre(Membre membre) {

		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement(
					"INSERT INTO `membre`(`nom_Membre`,`prenom_Membre`,`job_Membre`,`photo_Membre`,`description_Membre`,`facebook_Membre`,`link_Membre`,`twitter_Membre`,`insta_Membre`,`mail_Membre`,`langue_Membre`)VALUES(?,?,?,?,?,?,?,?,?,?,?);");
			stmt.setString(1, membre.getNom_Membre());
			stmt.setString(2, membre.getPrenom_Membre());
			stmt.setString(3, membre.getJob_Membre());
			stmt.setString(4, membre.getPhoto_Membre());
			stmt.setString(5, membre.getdescription_Membre());
			stmt.setString(6, membre.getFacebook_Membre());
			stmt.setString(7, membre.getLink_Membre());
			stmt.setString(8, membre.getTwitter_Membre());
			stmt.setString(9, membre.getInsta_Membre());
			stmt.setString(10, membre.getMail_Membre());
			stmt.setString(11, membre.getLangue_Membre());

			stmt.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void supprimerMembre(Integer id) {
		// Creer une nouvelle connexion a la BDD

		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();

			// Utiliser la connexion

			PreparedStatement stmt = connection.prepareStatement("DELETE FROM membre WHERE id_Membre=?");
			stmt.setInt(1, id);
			stmt.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
