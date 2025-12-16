package fr.diginamic.tp_factory;

import static org.junit.Assert.*;

import fr.diginamic.entite.element.*;
import fr.diginamic.factory.ElementFactory;
import fr.diginamic.factory.IElementFactory;
import org.junit.Test;

public class FactoryTest
{
    private static final IElementFactory elementFactory = new ElementFactory();

    @Test
    public void CreerAdditif()
    {
        Element additif1 = elementFactory.getElement(TypeElement.Additif, "Additif", 10, Unite.Milli_grammes);
        Element additif2 = new Additif("Additif", 10, Unite.Milli_grammes);

        assertEquals(additif2, additif1);
    }

    @Test
    public void CreerIngredient()
    {
        Element ingredient1 = elementFactory.getElement(TypeElement.Ingredient, "Ingredient", 10, Unite.Milli_grammes);
        Element ingredient2 = new Ingredient("Ingredient", 10, Unite.Milli_grammes);

        assertEquals(ingredient2, ingredient1);
    }

    @Test
    public void CreerAllergene()
    {
        Element allergene1 = elementFactory.getElement(TypeElement.Allergene, "Allergene", 10, Unite.Milli_grammes);
        Element allergene2 = new Allergene("Allergene", 10, Unite.Milli_grammes);

        assertEquals(allergene2, allergene1);
    }

    @Test
    public void CreerNullElement()
    {
        Element element = elementFactory.getElement(null, "Allergene", 10, Unite.Milli_grammes);
        assertNull(element);
    }
}
