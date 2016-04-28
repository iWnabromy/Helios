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
				listePartenaire.add(new Partenaire(rs.getString("nom_Partenaire"), 
						rs.getString("description_Partenaire"), rs.getString("photo_Partenaire"),
						rs.getString("lien_Partenaire")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listePartenaire;
	}
	
}
