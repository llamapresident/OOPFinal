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
        if (this.ingredient == Ingredients.bear_fat){
            this.effect = "Warmth";
        } else if (this.ingredient == Ingredients.rum) {
            this.effect = "strength";
        } else if (this.ingredient == Ingredients.chicken_blood) {
            this.effect = "Courage";
        } else if (this.ingredient == Ingredients.spider_glands) {
            this.effect = "poison";
        } else if (this.ingredient == Ingredients.lizards_tail) {
            this.effect = "Regeneration";
        } else if (this.ingredient == Ingredients.sugar) {
            this.effect = "Speed";
        }
    }

    @Override
    public String toString() {
        return "Single effect Potion: " + "potion of " + this.effect + '(' + ingredient + ')';
    }
}
