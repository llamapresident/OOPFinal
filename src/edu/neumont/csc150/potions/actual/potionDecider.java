package edu.neumont.csc150.potions.actual;

public class potionDecider extends potion{
    public potionDecider(String ingredients){
        Ingredient(ingredients);
        setEffect();
    }
    @Override
    public void Ingredient(String ingredients) {
        ingredients = ingredients.toLowerCase();
        ingredients = ingredients.replace(" ", "_");
        this.ingredient = Ingredients.valueOf(ingredients);
    }

    @Override
    public void setEffect() {
        switch (this.ingredient){
            case bear_fat -> this.effect = "warmth";
            case rum -> this.effect = "Strength";
            case chicken_blood -> this.effect = "Courage";
            case spider_glands -> this.effect = "Poison";
            case lizards_tail -> this.effect = "Regeneration";
            case sugar -> this.effect = "Speed";
        }
    }

    @Override
    public String toString() {
        return "Single effect Potion: " + "potion of " + this.effect + '(' + ingredient + ')';
    }
}
