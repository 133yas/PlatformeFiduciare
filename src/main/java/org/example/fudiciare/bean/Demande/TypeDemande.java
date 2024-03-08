package org.example.fudiciare.bean.Demande;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TypeDemande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Libelle;

    private String code;
    private double honnoraireComptableTraitant;
    private double honnoraireComptableValidateur;

    public double getHonnoraireComptableTraitant() {
        return honnoraireComptableTraitant;
    }

    public void setHonnoraireComptableTraitant(double honnoraireComptableTraitant) {
        this.honnoraireComptableTraitant = honnoraireComptableTraitant;
    }

    public double getHonnoraireComptableValidateur() {
        return honnoraireComptableValidateur;
    }

    public void setHonnoraireComptableValidateur(double honnoraireComptableValidateur) {
        this.honnoraireComptableValidateur = honnoraireComptableValidateur;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        code = code;
    }
}
