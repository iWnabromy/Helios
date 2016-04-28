package helios.siteweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import helios.siteweb.dao.EvenementDao;
import helios.siteweb.model.Evenement;

public class EvenementDaoImpl implements EvenementDao {
	
	public List<Evenement> getEvenement(){
		List<Evenement> listeEvenement = new ArrayList<Evenement>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM evenement");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeEvenement.add(new Evenement(rs.getInt("id_Evenement"), 
						rs.getString("article_Evenement"), rs.getString("nom_Evenement"),
						rs.getString("description_Evenement"), rs.getString("date_Evenement"),
						rs.getString("photo_Evenement"), rs.getString("langue_Evenement")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeEvenement;
	}

}
