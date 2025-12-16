package fr.diginamic.entite;

import java.util.Objects;

public class Marque
{
    private String nom;

    public Marque(String nom)
    {
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
        if (!(o instanceof Marque)) return false;
        Marque marque = (Marque) o;
        return Objects.equals(nom, marque.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }
}
