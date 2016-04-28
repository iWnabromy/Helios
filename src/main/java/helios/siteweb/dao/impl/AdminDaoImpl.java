package helios.siteweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import helios.siteweb.dao.AdminDao;
import helios.siteweb.model.Admin;

public class AdminDaoImpl implements AdminDao {

	public List<Admin> getAdmin(){
		List<Admin> listeAdmin= new ArrayList<Admin>();

		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM admin");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				listeAdmin.add(new Admin(rs.getInt("id_Admin"),rs.getString("nom_Admin"), rs.getString("login_Admin"),
						rs.getString("mdp_Admin")));
			}

			rs.close();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeAdmin;
	}
}	
