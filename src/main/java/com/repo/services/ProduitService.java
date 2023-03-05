package com.repo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repo.entities.Produit;
import com.repo.repositories.ProduitInterface;

@Service
public class ProduitService implements DaoProduit {

	@Autowired
	ProduitInterface produitInterface;
	
	@Override
	public Produit createProduit(Produit produit) {
		// TODO Auto-generated method stub
		return produitInterface.save(produit);
	}

	@Override
	public List<Produit> findAllProduits() {
		// TODO Auto-generated method stub
		return produitInterface.findAll();
	}

	@Override
	public Produit findProdByTitre(String titre) {
		// TODO Auto-generated method stub
		return produitInterface.findByTitre(titre);
	}

	@Override
	public List<Produit> findproByQuantite(int quantite) {
		// TODO Auto-generated method stub
		return produitInterface.findByQuantiteLessThan(quantite);
	}

}
