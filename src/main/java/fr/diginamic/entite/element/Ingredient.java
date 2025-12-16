package fr.diginamic.entite.element;

public class Ingredient extends Element {
    public Ingredient(String nom, double value, Unite unite)
    {
        super(nom, value, unite);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
        {
            return true;
        }

        if (!(obj instanceof Ingredient))
        {
            return false;
        }

        Ingredient ingredient = (Ingredient)obj;

        return (ingredient.getNom().equals(this.getNom())
                && ingredient.getValeur() == this.getValeur()
                && ingredient.getUnite() == this.getUnite());
    }
}
