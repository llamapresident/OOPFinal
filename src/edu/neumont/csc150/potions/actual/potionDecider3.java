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
        switch (this.ingredient) {
            case bear_fat -> this.effect = "warmth";
            case rum -> this.effect = "Strength";
            case chicken_blood -> this.effect = "Courage";
            case spider_glands -> this.effect = "Poison";
            case lizards_tail -> this.effect = "Regeneration";
            case sugar -> this.effect = "Speed";
        }
        switch (this.ingredient2){
            case bear_fat -> this.effect += ", Warmth";
            case rum -> this.effect += " and Strength";
            case chicken_blood -> this.effect += ", Courage";
            case spider_glands -> this.effect += ", Poison";
            case lizards_tail -> this.effect += ", Regeneration";
            case sugar -> this.effect += ", Speed";
        }
        switch (this.ingredient3){
            case bear_fat -> this.effect += " and Warmth";
            case rum -> this.effect += " and Strength";
            case chicken_blood -> this.effect += " and Courage";
            case spider_glands -> this.effect += " and Poison";
            case lizards_tail -> this.effect += " and Regeneration";
            case sugar -> this.effect += " and Speed";
        }
    }

    @Override
    public String toString() {
        return "Triple effect Potion: " + "potion of " + this.effect + '(' + ingredient + ", " + ingredient2 + ", and " + ingredient3 + ')';
    }
}
