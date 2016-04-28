package helios.siteweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import helios.siteweb.dao.GalerieDao;
import helios.siteweb.model.Galerie;

public class GalerieDaoImpl implements GalerieDao {
	
	public List<Galerie> getPhoto(){
		List<Galerie> listePhoto = new ArrayList<Galerie>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM galerie WHERE type_Galerie = ? ORDER BY date_Galerie DESC");
			stmt.setString(1, "photo");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listePhoto.add(new Galerie(rs.getInt("id_Galerie"),
						rs.getString("article_Galerie"),rs.getString("titre_Galerie"),
						rs.getString("description_Galerie"), rs.getString("lien_Galerie")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listePhoto;
	}
	
	public List<Galerie> getVideo(){
		List<Galerie> listePhoto = new ArrayList<Galerie>();
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM galerie WHERE type_Galerie = ? ORDER BY date_Galerie DESC");
			stmt.setString(1, "video");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listePhoto.add(new Galerie(rs.getInt("id_Galerie"),
						rs.getString("article_Galerie"),rs.getString("titre_Galerie"),
						rs.getString("description_Galerie"), rs.getString("lien_Galerie")));
			}
			
			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listePhoto;
	}
	
	
}
