package helios.siteweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import helios.siteweb.dao.PartenaireDao;
import helios.siteweb.model.Partenaire;

public class PartenaireDaoImpl implements PartenaireDao{

	public List<Partenaire> getPartenaire(){
		List<Partenaire> listePartenaire = new ArrayList<Partenaire>();

		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM partenaire");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listePartenaire.add(new Partenaire(rs.getInt("id_Partenaire"),rs.getString("nom_Partenaire"), 
						rs.getString("description_Partenaire"), rs.getString("photo_Partenaire"),
						rs.getString("lien_Partenaire"), rs.getInt("importance_Partenaire"), rs.getString("langue_Partenaire")));
			}

			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listePartenaire;
	}

	@Override
	public Partenaire getPartenaire(Integer id) {
		Partenaire p = new Partenaire(id, null, null, null, null, null, null);
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM partenaire WHERE id_Partenaire = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				p = new Partenaire(rs.getInt("id_Partenaire"),rs.getString("nom_Partenaire"), 
						rs.getString("description_Partenaire"), rs.getString("photo_Partenaire"),
						rs.getString("lien_Partenaire"), rs.getInt("importance_Partenaire"), rs.getString("langue_Partenaire"));
			}
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public void ModifierPartenaire(Partenaire nouveauPartenaire) {
		// Creer une nouvelle connexion a la BDD

		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();

			// Utiliser la connexion

			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM partenaire WHERE id_partenaire=?");
			stmt.setInt(1, nouveauPartenaire.getId_Partenaire());
			ResultSet resultSet = stmt.executeQuery();

			resultSet.next();
			PreparedStatement stmt2 = connection
					.prepareStatement("UPDATE partenaire SET nom_partenaire =?,"
							+ " description_partenaire=?,photo_partenaire=?, lien_partenaire=?, importance_partenaire=?,"
							+ " langue_partenaire=? "
							+ "  WHERE id_partenaire=?");


			stmt2.setInt(7, nouveauPartenaire.getId_Partenaire());

			stmt2.setString(1, nouveauPartenaire.getNom_Partenaire());
			stmt2.setString(2, nouveauPartenaire.getDescription_Partenaire());
			stmt2.setString(3, nouveauPartenaire.getPhoto_Partenaire());
			stmt2.setString(4, nouveauPartenaire.getLien_Partenaire());
			stmt2.setLong(5, nouveauPartenaire.getImportance_Partenaire());
			stmt2.setString(6, nouveauPartenaire.getLangue_Partenaire());

			stmt2.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void ajouterPartenaire(Partenaire partenaire) {
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement(
					"INSERT INTO `partenaire`(`nom_Partenaire`,`description_Partenaire`,`photo_Partenaire`,`lien_Partenaire`,`importance_Partenaire`,`langue_Partenaire`)VALUES(?,?,?,?,?,?);");
			stmt.setString(1, partenaire.getNom_Partenaire());
			stmt.setString(2, partenaire.getDescription_Partenaire());
			stmt.setString(3, partenaire.getPhoto_Partenaire());
			stmt.setString(4, partenaire.getLien_Partenaire());	
			stmt.setLong(5, partenaire.getImportance_Partenaire());
			stmt.setString(6, partenaire.getLangue_Partenaire());

			stmt.executeUpdate();

			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void supprimerPartenaire(Integer id) {
		// Creer une nouvelle connexion a la BDD

				try {
					Connection connection = DataSourceProvider.getDataSource().getConnection();

					// Utiliser la connexion

					PreparedStatement stmt = connection.prepareStatement("DELETE FROM partenaire WHERE id_Partenaire=?");
					stmt.setInt(1, id);
					stmt.executeUpdate();

					stmt.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
	}
}


