package helios.siteweb.dao;

import java.util.List;

import helios.siteweb.model.Categorie;

public interface CategorieDao {
	
	public List<Categorie> getCategorie();

	public Categorie getCategorie(Integer id);

	public void ModifierCategorie(Categorie nouvellecategorie);

	public void ajouterCategorie(Categorie nouvellecategorie);

	public void supprimerCategorie(Integer id_Categorie);

}
