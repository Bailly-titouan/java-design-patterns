package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement
{
    private String nom;

    private List<IElement> elements;

    public Service(String nom) {
        this.elements = new ArrayList<IElement>();
        this.nom = nom;
    }

    @Override
    public double calculerSalaire() {

        double salaireTotale = 0;
        for (IElement element : elements)
        {
            salaireTotale = salaireTotale + element.calculerSalaire();
        }
        return salaireTotale;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<IElement> getElements() {
        return elements;
    }

    public void setElements(List<IElement> elements) {
        this.elements = elements;
    }

    public void addElement(IElement element)
    {
        this.elements.add(element);
    }
}
