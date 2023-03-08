package edu.neumont.csc150.potions.actual;

public class potionDecider3 extends potion2{
    Ingredients ingredient3;
    public potionDecider3(String ingredient, String ingredient2, String ingredient3){
        Ingredient(ingredient);
        Ingredient2(ingredient2);
        Ingredient3(ingredient3);
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

    public void Ingredient3(String ingredients){
        ingredients = ingredients.toLowerCase();
        ingredients = ingredients.replace(" ", "_");
        this.ingredient3 = Ingredients.valueOf(ingredients);
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
            this.effect += ", Warmth";
        } else if (this.ingredient2 == Ingredients.rum) {
            this.effect += ", strength";
        } else if (this.ingredient2 == Ingredients.chicken_blood) {
            this.effect += ", Courage";
        } else if (this.ingredient2 == Ingredients.spider_glands) {
            this.effect += ", poison";
        } else if (this.ingredient2 == Ingredients.lizards_tail) {
            this.effect += ", Regeneration";
        } else if (this.ingredient2 == Ingredients.sugar) {
            this.effect += ", Speed";
        }
        if (this.ingredient3 == Ingredients.bear_fat){
            this.effect += ", and Warmth";
        } else if (this.ingredient3 == Ingredients.rum) {
            this.effect += ", and strength";
        } else if (this.ingredient3 == Ingredients.chicken_blood) {
            this.effect += ", and Courage";
        } else if (this.ingredient3 == Ingredients.spider_glands) {
            this.effect += ", and poison";
        } else if (this.ingredient3 == Ingredients.lizards_tail) {
            this.effect += ", and Regeneration";
        } else if (this.ingredient3 == Ingredients.sugar) {
            this.effect += ", and Speed";
        }
    }

    @Override
    public String toString() {
        return "Triple effect Potion: " + "potion of " + this.effect + '(' + ingredient + ", " + ingredient2 + ", and " + ingredient3 + ')';
    }
}
