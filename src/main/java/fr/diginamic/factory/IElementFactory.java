package fr.diginamic.factory;

import fr.diginamic.entite.element.Element;
import fr.diginamic.entite.element.TypeElement;
import fr.diginamic.entite.element.Unite;

public interface IElementFactory
{
    Element getElement(TypeElement type, String nom, double valeur, Unite unite);
}
