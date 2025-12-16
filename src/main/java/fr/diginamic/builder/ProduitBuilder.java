package fr.diginamic.builder;

import fr.diginamic.entite.Categorie;
import fr.diginamic.entite.Marque;
import fr.diginamic.entite.element.*;
import fr.diginamic.exception.ProduitException;
import fr.diginamic.factory.ElementFactory;
import fr.diginamic.factory.IElementFactory;

public class ProduitBuilder
{
    private Produit produit;
    private IElementFactory elementFactory = new ElementFactory();

    public ProduitBuilder()
    {
        this.produit = new Produit();
    }

    public ProduitBuilder appendNom(String nom)
    {
        this.produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendGrade(String grade)
    {
        this.produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder appendAdditif(String nom, double qteMilligrammes)
    {
        Additif additif = (Additif)this.elementFactory.getElement(TypeElement.Additif, nom, qteMilligrammes, Unite.Milli_grammes);
        this.produit.appendAdditif(additif);
        return this;
    }

    public ProduitBuilder appendAllergene(String nom, double qteMilligrammes)
    {
        Allergene allergene = (Allergene)this.elementFactory.getElement(TypeElement.Allergene, nom, qteMilligrammes, Unite.Milli_grammes);
        this.produit.appendAllergene(allergene);
        return this;
    }

    public ProduitBuilder appendIngredient(String nom, double qteMilligrammes)
    {
        Ingredient ingredient = (Ingredient)this.elementFactory.getElement(TypeElement.Ingredient, nom, qteMilligrammes, Unite.Milli_grammes);
        this.produit.appendIngredient(ingredient);
        return this;
    }

    public ProduitBuilder appendCategorie(String nom)
    {
        Categorie categorie = new Categorie(nom);
        this.produit.setCategorie(categorie);
        return this;
    }

    public ProduitBuilder appendMarque(String nom)
    {
        Marque marque = new Marque(nom);
        this.produit.setMarque(marque);
        return this;
    }

    public Produit get() throws ProduitException
    {
        if (this.produit.getNom() == null || this.produit.getNom().isEmpty())
        {
            throw new ProduitException("Nom manquant ou vide !");
        }

        if (this.produit.getGrade() == null || this.produit.getGrade().isEmpty())
        {
            throw new ProduitException("Grade manquant ou vide !");
        }

        if (this.produit.getCategorie() == null)
        {
            throw new ProduitException("Catégorie manquante !");
        }

        if (this.produit.getMarque() == null)
        {
            throw new ProduitException("Marque manquante !");
        }

        return this.produit;
    }
}
