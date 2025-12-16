package fr.diginamic.entite.element;

public class Allergene extends Element {
    public Allergene(String nom, double value, Unite unite)
    {
        super(nom, value, unite);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
        {
            return true;
        }

        if (!(obj instanceof Allergene))
        {
            return false;
        }

        Allergene allergene = (Allergene)obj;

        return (allergene.getNom().equals(this.getNom())
                && allergene.getValeur() == this.getValeur()
                && allergene.getUnite() == this.getUnite());
    }
}
