package helios.siteweb.model;

public class Piece {
	
	private Integer id_Piece;
	private String nom_Piece;
	private String voiture_Piece;
	private String description_Piece;
	private String langue_Piece;
	
	public Piece(Integer id_Piece,
			String nom_Piece, 
			String voiture_Piece,
			String description_Piece,
			String langue_Piece){
		this.id_Piece = id_Piece;
		this.nom_Piece = nom_Piece;
		this.voiture_Piece = voiture_Piece;
		this.description_Piece = description_Piece;
		this.langue_Piece = langue_Piece;
	}

	public Integer getId_Piece() {
		return id_Piece;
	}

	public void setId_Piece(Integer id_Piece) {
		this.id_Piece = id_Piece;
	}

	public String getNom_Piece() {
		return nom_Piece;
	}

	public void setNom_Piece(String nom_Piece) {
		this.nom_Piece = nom_Piece;
	}

	public String getVoiture_Piece() {
		return voiture_Piece;
	}

	public void setVoiture_Piece(String voiture_Piece) {
		this.voiture_Piece = voiture_Piece;
	}

	public String getDescription_Piece() {
		return description_Piece;
	}

	public void setDescription_Piece(String description_Piece) {
		this.description_Piece = description_Piece;
	}

	public String getLangue_Piece() {
		return langue_Piece;
	}

	public void setLangue_Piece(String langue_Piece) {
		this.langue_Piece = langue_Piece;
	}
	
}
