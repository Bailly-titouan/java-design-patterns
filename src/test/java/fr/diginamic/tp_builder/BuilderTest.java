package fr.diginamic.tp_builder;

import fr.diginamic.builder.Produit;
import fr.diginamic.builder.ProduitBuilder;
import fr.diginamic.entite.Categorie;
import fr.diginamic.entite.Marque;
import fr.diginamic.entite.element.*;
import fr.diginamic.exception.ProduitException;
import fr.diginamic.factory.ElementFactory;
import fr.diginamic.factory.IElementFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class BuilderTest
{
    private static final IElementFactory elementFactory = new ElementFactory();

    @Test
    public void testCreerValideProduct()
    {
        Marque marque = new Marque("Carrefour");
        Categorie categorie = new Categorie("Categorie");
        Ingredient ingredient = (Ingredient)elementFactory.getElement(TypeElement.Ingredient, "Ingredient", 10, Unite.Milli_grammes);
        Additif additif = (Additif)elementFactory.getElement(TypeElement.Additif, "Additif", 50, Unite.Milli_grammes);
        Allergene allergene = (Allergene)elementFactory.getElement(TypeElement.Allergene, "Allergene", 30, Unite.Milli_grammes);

        ProduitBuilder produitBuilder = new ProduitBuilder();
        produitBuilder.appendNom("Produit")
                      .appendMarque("Carrefour")
                      .appendIngredient("Ingredient", 10)
                      .appendAdditif("Additif", 50)
                      .appendAllergene("Allergene", 30)
                      .appendCategorie("Categorie")
                      .appendGrade("Grade");
        Produit produit = produitBuilder.get();

        assertEquals(produit.getAdditif().get(0), additif);
        assertEquals(produit.getIngredient().get(0), ingredient);
        assertEquals(produit.getAllergene().get(0), allergene);
        assertEquals(produit.getNom(), "Produit");
        assertEquals(produit.getMarque(), marque);
        assertEquals(produit.getCategorie(), categorie);
        assertEquals(produit.getGrade(), "Grade");
    }

    @Test
    public void testWithMarqueNull()
    {
        ProduitBuilder produitBuilder = new ProduitBuilder();
        produitBuilder.appendNom("Produit")
//                .appendMarque("Carrefour")
                .appendIngredient("Ingredient", 10)
                .appendAdditif("Additif", 50)
                .appendAllergene("Allergene", 30)
                .appendCategorie("Categorie")
                .appendGrade("Grade");

        assertThrows(ProduitException.class, produitBuilder::get);
    }

    @Test
    public void testWithCategorieNull()
    {
        ProduitBuilder produitBuilder = new ProduitBuilder();
        produitBuilder.appendNom("Produit")
                .appendMarque("Carrefour")
                .appendIngredient("Ingredient", 10)
                .appendAdditif("Additif", 50)
                .appendAllergene("Allergene", 30)
//                .appendCategorie("Categorie")
                .appendGrade("Grade");

        assertThrows(ProduitException.class, produitBuilder::get);
    }

    @Test
    public void testWithNomNullOrEmpty()
    {
        ProduitBuilder produitBuilder = new ProduitBuilder();
        produitBuilder.appendMarque("Carrefour")
                .appendIngredient("Ingredient", 10)
                .appendAdditif("Additif", 50)
                .appendAllergene("Allergene", 30)
                .appendCategorie("Categorie")
                .appendGrade("Grade");

        assertThrows(ProduitException.class, produitBuilder::get);
        produitBuilder.appendNom("");
        assertThrows(ProduitException.class, produitBuilder::get);
    }

    @Test
    public void testWithGradeNullOrEmpty()
    {
        ProduitBuilder produitBuilder = new ProduitBuilder();
        produitBuilder.appendNom("Nom")
                .appendMarque("Carrefour")
                .appendIngredient("Ingredient", 10)
                .appendAdditif("Additif", 50)
                .appendAllergene("Allergene", 30)
                .appendCategorie("Categorie");
//                .appendGrade("Grade");
        assertThrows(ProduitException.class, produitBuilder::get);
        produitBuilder.appendGrade("");
        assertThrows(ProduitException.class, produitBuilder::get);
    }
}
