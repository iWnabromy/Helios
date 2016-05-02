package helios.siteweb.dao;

import java.util.List;

import helios.siteweb.model.Partenaire;

public interface PartenaireDao {
	
	public List<Partenaire> getPartenaire();

	public Partenaire getPartenaire(Integer id);

	public void ModifierPartenaire(Partenaire nouveauPartenaire);
	
	public void ajouterPartenaire(Partenaire partenaire);

	public void supprimerPartenaire(Integer id_Partenaire);

}
