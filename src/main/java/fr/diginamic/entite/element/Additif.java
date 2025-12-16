package fr.diginamic.entite.element;

public class Additif extends Element {
    public Additif(String nom, double value, Unite unite)
    {
        super(nom, value, unite);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
        {
            return true;
        }

        if (!(obj instanceof Additif))
        {
            return false;
        }

        Additif additif = (Additif)obj;

        return (additif.getNom().equals(this.getNom())
                && additif.getValeur() == this.getValeur()
                && additif.getUnite() == this.getUnite());
    }
}
