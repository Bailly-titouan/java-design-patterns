package fr.diginamic.factory;

import fr.diginamic.entite.element.*;

public class ElementFactory implements IElementFactory
{
    public Element getElement(TypeElement type, String nom, double valeur, Unite unite) {
        if (type == null)
        {
            return null;
        }

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
