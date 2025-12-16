package fr.diginamic.builder;

import fr.diginamic.entite.Categorie;
import fr.diginamic.entite.Marque;
import fr.diginamic.entite.element.Additif;
import fr.diginamic.entite.element.Allergene;
import fr.diginamic.entite.element.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Produit
{
    private String nom;
    private String grade;
    private Marque marque;
    private List<Ingredient> ingredient;
    private List<Allergene> allergene;
    private List<Additif> additif;
    private Categorie categorie;

    Produit()
    {
        this.ingredient = new ArrayList<Ingredient>();
        this.allergene = new ArrayList<Allergene>();
        this.additif = new ArrayList<Additif>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }

    public void appendIngredient(Ingredient ingredient)
    {
        this.ingredient.add(ingredient);
    }

    public List<Allergene> getAllergene() {
        return allergene;
    }

    public void setAllergene(List<Allergene> allergene) {
        this.allergene = allergene;
    }

    public void appendAllergene(Allergene allergene)
    {
        this.allergene.add(allergene);
    }

    public List<Additif> getAdditif() {
        return additif;
    }

    public void setAdditif(List<Additif> additif) {
        this.additif = additif;
    }

    public void appendAdditif(Additif additif)
    {
        this.additif.add(additif);
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
