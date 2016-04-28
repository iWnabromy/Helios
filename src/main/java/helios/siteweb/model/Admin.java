package helios.siteweb.model;

public class Admin {
	
	private Integer id_Admin;
	private String nom_Admin;
	private String login_Admin;
	private String mdp_Admin;
	
	public Admin(Integer id_Amdin, 
			String nom_Admin, 
			String login_Admin, 
			String mdp_Admin){
		this.id_Admin = id_Amdin;
		this.nom_Admin = nom_Admin;
		this.login_Admin = login_Admin;
		this.mdp_Admin = mdp_Admin;
	}

	public int getId_Admin() {
		return id_Admin;
	}

	public void setId_Admin(int id_Admin) {
		this.id_Admin = id_Admin;
	}

	public String getNom_Admin() {
		return nom_Admin;
	}

	public void setNom_Admin(String nom_Admin) {
		this.nom_Admin = nom_Admin;
	}

	public String getLogin_Admin() {
		return login_Admin;
	}

	public void setLogin_Admin(String login_Admin) {
		this.login_Admin = login_Admin;
	}

	public String getMdp_Admin() {
		return mdp_Admin;
	}

	public void setMdp_Admin(String mdp_Admin) {
		this.mdp_Admin = mdp_Admin;
	}
	
}
