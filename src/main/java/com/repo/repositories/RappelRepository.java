package com.repo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repo.entities.Rappel;

public interface RappelRepository extends JpaRepository<Rappel, Long> {
//CRUD + findById
	List<Rappel> findByTitre(String titre);
	List<Rappel> findByDescription(String description);
	//basique methods
	void removeByTitre(String titre); // deleteBy est correcte également
	List<Rappel> findByTitreOrDescription(String titre,String description); // méthode alternative
	List<Rappel> findByTitreAndDescription(String titre, String description);
	List<Rappel> findByDescriptionLike(String description); // verifie si la description contient
	List<Rappel> findByPrixGreaterThan(double prix);
	List<Rappel> findByPrixLessThan(double prix);
	List<Rappel> findByPrixBetween(double prixmin,double prixMax);
	
	
	
}
