package com.repo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repo.entities.Produit;

public interface ProduitInterface extends JpaRepository<Produit, Long> {
Produit findByTitre(String titre);
List<Produit> findByDescriptionLike(String description);
List<Produit> findByQuantiteLessThan(int quantite);
}
