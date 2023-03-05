package com.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.repo.entities.Produit;
import com.repo.services.ProduitService;

@SpringBootApplication
public class RappelrepoApplication implements CommandLineRunner {
@Autowired
ProduitService produitService;
	
	public static void main(String[] args) {
		SpringApplication.run(RappelrepoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Produit p1=produitService.createProduit(new Produit(0, "pc", "pc mini note book", 2));
		Produit p2=produitService.createProduit(new Produit(0, "ordinateur toshiba", "pc gamer", 3));
		Produit p3=produitService.createProduit(new Produit(0, "tablette", "tablette android", 20));
		p3.setDescription("tablette android v17");
		produitService.createProduit(p3);
		Produit p4=produitService.findProdByTitre("ordinateur toshiba");
		System.out.println(p4.toString());
		produitService.findproByQuantite(4).forEach(q->{
			System.out.println("*** "+q.toString()+"*** ");
			
		});
	}

}
