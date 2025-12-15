package fr.diginamic.factory;

import fr.diginamic.entite.Element;
import fr.diginamic.entite.TypeElement;
import fr.diginamic.entite.Unite;

public interface IElementFactory
{
    Element getElement(TypeElement type, String nom, double valeur, Unite unite);
}
