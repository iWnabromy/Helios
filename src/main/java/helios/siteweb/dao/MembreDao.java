package helios.siteweb.dao;

import java.util.List;

import helios.siteweb.model.Membre;

public interface MembreDao {
	
	public List<Membre> getMembre();

	public Membre getMembre(Integer id);

	public void ModifierMembre(Membre nouveauMembre);

	public void ajouterMembre(Membre membre);

	public void supprimerMembre(Integer id_Membre);

}
