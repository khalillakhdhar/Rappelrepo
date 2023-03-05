package com.repo.services;

import java.util.List;

import com.repo.entities.Produit;

public interface DaoProduit {
public Produit createProduit(Produit produit);
public List<Produit> findAllProduits();
public Produit findProdByTitre(String titre);
public List<Produit> findproByQuantite(int quantite);
}
