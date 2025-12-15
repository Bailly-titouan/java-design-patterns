package fr.diginamic.factory;

import fr.diginamic.entite.*;

public class ElementFactory implements IElementFactory
{
    public static Element getElement(TypeElement type, String nom, double valeur, Unite unite) {
        switch (type) {
            case Additif:
                return new Additif(nom, valeur, unite);
            case Allergene:
                return new Allergene(nom, valeur, unite);
            case Ingredient:
                return new Ingredient(nom, valeur, unite);
            default:
                return null;
        }
    }
}
