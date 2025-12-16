package fr.diginamic.entite;

import java.util.Objects;

public class Categorie
{
    private String nom;

    public Categorie(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categorie)) return false;
        Categorie categorie = (Categorie) o;
        return Objects.equals(nom, categorie.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }
}
