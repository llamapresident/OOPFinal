package edu.neumont.csc150.potions.actual;

public class potionDecider2 extends potion2{
    public potionDecider2(String ingredient, String ingredient2){
        Ingredient(ingredient);
        Ingredient2(ingredient2);
        setEffect();
    }
    @Override
    public void Ingredient(String ingredients) {
        ingredients = ingredients.toLowerCase();
        ingredients = ingredients.replace(" ", "_");
        this.ingredient = Ingredients.valueOf(ingredients);
    }

    @Override
    public void Ingredient2(String ingredients) {
        ingredients = ingredients.toLowerCase();
        ingredients = ingredients.replace(" ", "_");
        this.ingredient2 = Ingredients.valueOf(ingredients);
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
        if (this.ingredient2 == Ingredients.bear_fat){
            this.effect += " and Warmth";
        } else if (this.ingredient2 == Ingredients.rum) {
            this.effect += " and strength";
        } else if (this.ingredient2 == Ingredients.chicken_blood) {
            this.effect += " and Courage";
        } else if (this.ingredient2 == Ingredients.spider_glands) {
            this.effect += " and Poison";
        } else if (this.ingredient2 == Ingredients.lizards_tail) {
            this.effect += " and Regeneration";
        } else if (this.ingredient2 == Ingredients.sugar) {
            this.effect += " and Speed";
        }
    }

    @Override
    public String toString() {
        return "Double effect Potion: " + "potion of " + this.effect + '(' + ingredient + " and " + ingredient2 + ')';
    }
}
