package com.repo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique = true,nullable = false)
private String titre;

private String description;
@Min(value = 1)
private int quantite;
}
